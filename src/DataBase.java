import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String userName = "root";
        String password = "enaca2225";
        String connectionUrl = "jdbc:mysql://localhost:3306/users?useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connectionUrl,userName,password);
        Statement statement = connection.createStatement();
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS Books (title CHAR(30), author VARCHAR(50), price MEDIUMINT, keywords CHAR(100), publisher CHAR(30), edition CHAR(30), editionYear MEDIUMINT, PRIMARY KEY(title)) ");
        statement.executeUpdate("insert into Books set title = 'Introduction to Algorithms', author = 'Thomas H. Cormen', price = 1300, keywords = 'course material', publisher = 'MIT Press', edition = 'third edition', editionYear = 2009");
    }
}
