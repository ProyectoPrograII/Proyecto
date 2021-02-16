package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Valery
 */PRUEBA TEXTO
public class ConexionSQL {
   
    public static Connection getConexion(){
        String conexionURL = "jdbc:sqlserver://DESKTOP-TPBS50J:1433;" 
                            + "databaseName=RESERVA;" 
                            + "user=ValerySQL;" 
                            + "password=ValerySQL;" 
                            + "loginTimeout = 30;";
        
        try{
            Connection conectado = DriverManager.getConnection(conexionURL);
            return conectado;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }   
    
    public boolean verificarConexion(){
        //String bases = "";
        
        try{
            Statement sql = ConexionSQL.getConexion().createStatement();
            JOptionPane.showMessageDialog(null, "!Su conexión se realizó con éxito¡ Ahora puedes acceder a la base de datos.");
            return true;
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
            return false;
        }
    }
}
