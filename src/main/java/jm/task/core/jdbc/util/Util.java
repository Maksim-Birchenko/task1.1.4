package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String password = "1234";
    private static final String username = "postgres";
    private static final String url = "jdbc:postgresql://localhost:5432/maksbirchenko";
    private static final String dialect = "org.hibernate.dialect.PostgreSQLDialect";
    public static Connection open() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
