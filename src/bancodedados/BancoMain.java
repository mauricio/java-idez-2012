package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BancoMain {

	public static void main(String[] args) throws Exception {		
		String criarTabela = 
				"CREATE TABLE clientes ( id IDENTITY PRIMARY KEY, nome VARCHAR_IGNORECASE ( 10000 ), cpf VARCHAR_IGNORECASE ( 10000 ), data_de_nascimento TIMESTAMP );";
		
		Connection c = 
				DriverManager.getConnection("jdbc:h2:clientes");
		Statement s = c.createStatement();
		s.execute("DROP TABLE IF EXISTS clientes");
		s.execute(criarTabela);
		c.close();
		System.out.println("rodou");
	}
	
}
