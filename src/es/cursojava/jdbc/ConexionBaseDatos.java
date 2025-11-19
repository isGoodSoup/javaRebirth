package es.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.cursojava.utils.Dexter;

public class ConexionBaseDatos {
	private final static Logger log = LoggerFactory.getLogger(ConexionBaseDatos.class);
	
	public static void main(String[] args) {
        conectaOracle();
    }

    private static void conectaOracle() {
    	String url_oracle = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
		String username = "HR";
		String password = "HR";

		try(Connection connection = DriverManager.getConnection(url_oracle, username, password)) {
			if(connection != null) {
				log.info("Conexión establecida");
			}
		} catch(SQLException e) {
			new Dexter().printException(e);
		}
    }
	
//	private static void conectaOracle2() {
//		String url_oracle = "jdbc:oracle:thin:HR/hr@localhost:1522:XE";
//		String url_oracle2 = "jdbc:oracle:thin:@localhost:1521:XE";
//		String username = "HR";
//		String password = "HR";
//		try {
//			OracleDataSource ods = new OracleDataSource();
//			try (Connection connection =  ods.getConnection();   )  {
//				ods.setURL(url_oracle);
//				if (connection!=null) {
//					System.out.println("Conexion establecida");
//				}
//				System.out.println(7/0);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
}
