package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;


public class DbUtil {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/test1_db";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER_NAME,PASSWORD);
    }
}
