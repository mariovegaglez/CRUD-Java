
package conexion;

import java.sql.*;
import java.util.*;

public class conexionDB {
    
    private static Connection conexion;
    private static final String usuario = "root";
    private static final String contraseña = "";
    private static final String url = "jdbc:mysql://localhost:3306/cafeteria1";

    public static Connection abrirConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return conexion;
    }
    
    public static void cerrarConexion(){
        try{
            if(!conexion.isClosed()){
                conexion.close();
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
