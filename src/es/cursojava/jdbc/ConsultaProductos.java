package es.cursojava.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import es.cursojava.utils.UtilsDB;

public class ConsultaProductos {
    private static final String CONSULTA_PRODUCTOS=""+
                    " ";
    public static void main(String[] args) {
    	consultaProductos();
    }

    public static void consultaProductos() {
        Connection conexion = UtilsDB.crearConexion();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(CONSULTA_PRODUCTOS);
            while(rs.next()){
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                int edad = rs.getInt("EDAD");
                double salario = rs.getDouble("SALARIO");

                System.out.println("Registro.[ id: "+ id + ", nombre: "+ nombre
                        + ", edad: " + edad + ", salario: "+salario+ "]");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
        	UtilsDB.cierraConexion(conexion);
            try {
                st.close();
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("TERMINA");
    }
}
