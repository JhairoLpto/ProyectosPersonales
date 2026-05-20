package packageConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    public static Connection getConnetion() throws Exception{
        try {
            String url = "jdbc:mysql://localhost:3306/foodtracker";
            String user = "root";
            String pwd = "mysql";
            return DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            throw(e);
        }
    }
    
    public static Connection getConnexion() throws Exception{
        return getConnetion();
    }
}
