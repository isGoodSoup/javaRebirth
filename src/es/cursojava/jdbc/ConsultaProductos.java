package es.cursojava.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import es.cursojava.utils.UtilsDB;

public class ConsultaProductos {
    private static final String CONSULTA_PRODUCTOS="SELECT NOMBRE, CATEGORIA, PRECIO, STOCK, FECHA_ALTA, ESTADO, CODIGO_SKU, CREADO_POR, IVA\n"
    		+ "FROM TB_PRODUCTOS_PROFE"+
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
            while (rs.next()) {
                String nombre = rs.getString("NOMBRE");
                String categoria = rs.getString("CATEGORIA");
                double precio = rs.getDouble("PRECIO");
                int stock = rs.getInt("STOCK");
                Date fechaAlta = rs.getDate("FECHA_ALTA");
                String estado = rs.getString("ESTADO");
                String codigoSku = rs.getString("CODIGO_SKU");
                String creadoPor = rs.getString("CREADO_POR");
                double iva = rs.getDouble("IVA");

                System.out.println(
                    "Producto: " + nombre +
                    " | Categoría: " + categoria +
                    " | Precio: " + precio +
                    " | Stock: " + stock +
                    " | Fecha alta: " + fechaAlta +
                    " | Estado: " + estado +
                    " | SKU: " + codigoSku +
                    " | Creado por: " + creadoPor +
                    " | IVA: " + iva
                );
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
