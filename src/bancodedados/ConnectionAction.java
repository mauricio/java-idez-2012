package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionAction {

	public ConnectionAction() {
		this.action();
	}
	
	public abstract void doWithConnection( Connection c )
		throws Exception;
	
	private void action() {		
		Connection c = this.abrirConexao();		
		try {
			c.setAutoCommit(false);
			this.doWithConnection(c);
			c.commit();
		} catch ( Exception e ) {
			try {
				c.rollback();
			} catch ( SQLException sqlException ) {
				throw new IllegalStateException(sqlException);
			}
			throw new IllegalStateException(e);
		} finally {
			try {
				c.close();
			} catch ( SQLException sqlException ) {
				throw new IllegalStateException(sqlException);
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
	
}
