
package gestiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class GestionBD {
  
   
    Connection conexion = null;   
    Statement sentencia = null;
    ResultSet resultados = null;   
    String NOMBREBD = "empresa.sqlite";   
    String DRIVER = "org.sqlite.JDBC";   
    String URL = "jdbc:sqlite:" + NOMBREBD;
    
    
    public void crearBD(){
        
        try{
            
            Class.forName(DRIVER);
            
            conexion = DriverManager.getConnection(URL);
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error:" + e.getMessage());
        }
        
        System.out.println("Base de datos creada con exito!");
        
    }
    
   
    
}
