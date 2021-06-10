package company.lesson2.server;

//import java.util.List;

///**
// * Created by Artem Kropotov on 24.05.2021
// */
//public class DBAuthService  implements AuthService<User>  {
//    @Override
//    public User findByLoginAndPassword(String login, String password) {
//        return null;
//    }
//
//    @Override
//    public User findByLoginOrNick(String login, String nick) {
//        return null;
//    }
//
//    @Override
//    public User save(User object) {
//        return null;
//    }
//
//    @Override
//    public User remove(User object) {
//        return null;
//    }
//
//    @Override
//    public User removeById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public User findById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public List<User> findAll() {
//        return null;
//    }
//}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAuthService {

    private static String DB_URL="";
    private static String USER="";
    private static String PASS="";

    private static Connection connection;
    private static Statement statement;



    public static void main(String[] args) {
       try {
            connect();
//            Работа с БД.
       } catch(SQLException e) {
            e.printStackTrace();
       } finally {
            disconnect();
    }
}

public static void connect() throws SQLException {
    Class.forName();
    System.out.println("PostgreSQL JDBC Driver successdully connected");
    connection = DriverManager.getConnection(DB_URL, USER, PASS);
    Statement statement = connection.createStatement();
    System.out.println("Success connected to DD");
}

public static void disconnect() {
    try {
        if (connection != null) {
            connection.close();
        }
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }

}

