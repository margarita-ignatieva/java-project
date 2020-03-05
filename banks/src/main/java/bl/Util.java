package bl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String sql_driver ="com.mysql.cj.jdbc.Driver";
    private static final String sql_url ="jdbc:mysql://localhost:3306/banks?serverTimezone=Europe/Moscow";
    private static final String sql_user="root";
    private static final String sql_password ="space_monkey987654321";

    public Connection getConnection(){
        Connection connection =null;
        try{
            Class.forName(sql_driver);
            connection = DriverManager.getConnection(sql_url,sql_user,sql_password);
            System.out.println("Connection OK");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection error");
        }
        return connection;
    }
}
