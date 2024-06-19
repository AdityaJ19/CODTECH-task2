import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionCode {
    public static void main(String[] args) {
        //Database url
        String url = "jdbc:mysql://localhost: 3306/Hospital";

        //Database Credentials
        String username = "root";
        String password = "#aditya19";

        //Establish the Connection
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            System.out.println("Connected to the Database.");

            //Perform database operations here
        }
        catch (SQLException e){
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
