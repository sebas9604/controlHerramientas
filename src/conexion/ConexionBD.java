
package conexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tolis
 */
public class ConexionBD {

  
    
     public static Connection connect(){
         Properties prop = new Properties();
         InputStream is = null;
        try {
            is = new FileInputStream("./././propiedades.properties");
            prop.load(is);
           /* String url = "jdbc:mysql://localhost:3306/controlherramientas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String pass = "pass123";*/
            String url = prop.getProperty("URL");
            String user = prop.getProperty("USER");
            String pass = prop.getProperty("PASS");
            System.out.println("Conectando...");
            //System.out.println(url + "\n" + user + "\n" + pass);
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Conectado!!");
            
            
            return connection;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error conectando a la base de datos " + ex);
        } catch (FileNotFoundException ex) {
             Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
         }
        return null;

     }
    
}
