import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    public  static void main(String [] args) throws SQLException {
        String url = "jdbc:mysql://localhost:5432/webchat";
        String user = "uyvuong";
        String password = "123456";

        try{
            //this is trying to connect to databas
            Connection connection = DriverManager.getConnection(url,user,password);
            if(connection != null){  //if success
                System.out.println("Connected");
            }
        }
        catch(SQLException e){
            System.out.println("Failed to connect to database");
            e.printStackTrace();  //printing out the error could be wrong password
        }
    }
}
