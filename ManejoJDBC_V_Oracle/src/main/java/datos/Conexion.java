package datos;

import java.sql.*;


public class Conexion {

    private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String JDBC_USER = "briandb"; 
    private static final String JDBC_PASSWORD = "briandb";
    
    public static Connection getConnection() throws SQLException{
     return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }  
    
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
