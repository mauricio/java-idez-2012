package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CadastroDeClientes implements Cadastro<Cliente> {

	public CadastroDeClientes() {
		this(false);
	}

	public CadastroDeClientes(boolean criarBanco) {
		if (criarBanco) {
			String criarTabela = "CREATE TABLE clientes ( id IDENTITY PRIMARY KEY, nome VARCHAR_IGNORECASE ( 10000 ), cpf VARCHAR_IGNORECASE ( 10000 ), data_de_nascimento TIMESTAMP );";

			try {
				Connection c = this.abrirConexao();

				Statement s = c.createStatement();
				s.execute("DROP TABLE IF EXISTS clientes");
				s.execute(criarTabela);
				c.close();
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}
	}

	private Connection abrirConexao() {
		try {
			return DriverManager.getConnection("jdbc:h2:clientes");
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public void adicionar(final Cliente c) {

		new ConnectionAction() {

			@Override
			public void doWithConnection(Connection connection)
					throws Exception {
				PreparedStatement ps = connection
						.prepareStatement("INSERT INTO clientes (nome,cpf,data_de_nascimento) "
								+ " VALUES (?, ?, ?)");

				ps.setString(1, c.getNome());
				ps.setString(2, c.getCpf());
				long time = c.getDataDeNascimento().getTime();
				ps.setTimestamp(3, new Timestamp(time));

				ps.execute();
			}
		};

	}

	public List<Cliente> listar() {
		final List<Cliente> clientes = new ArrayList<Cliente>();

		new ConnectionAction() {
			
			@Override
			public void doWithConnection(Connection c) throws Exception {
				Statement s = c.createStatement();
				ResultSet rs = s.executeQuery("SELECT * FROM clientes");

				while (rs.next()) {
					Cliente cliente = new Cliente();
					cliente.setId(rs.getInt("id"));
					cliente.setNome(rs.getString("nome"));
					cliente.setCpf(rs.getString("cpf"));
					Timestamp data = rs.getTimestamp("data_de_nascimento");
					cliente.setDataDeNascimento(new Date(data.getTime()));
					clientes.add(cliente);
				}				
			}
		};
		
		return clientes;
	}

}
