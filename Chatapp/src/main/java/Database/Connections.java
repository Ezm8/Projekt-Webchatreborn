import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;

public class Connections {
    static final String database = "jdbc:mysql://localhost:3388/webchat";
    static final String username = "uyvuong";
    static final String password = "123456";
    private java.sql.Connection connection;


    //method connection
    public Connections() throws SQLException, ClassNotFoundException {
    this(database,username,password);

}

    public Connections(String database, String username, String password)throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Properties props = new Properties();
        props.setProperty("user", username);
        props.setProperty("password", password);
        connection = DriverManager.getConnection(database,props);
    }
}