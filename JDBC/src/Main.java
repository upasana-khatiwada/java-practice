import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String databaseUrl ="jdbc:mysql:localhost/upasanadb";

        //connection database
                Connection conn = DriverManager.getConnection(databaseUrl,"root","helloMeow2");
        System.out.println("database connection success");

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("select * from student");
        //The next() method is called on rs to move the cursor to the next row.
        while(rs.next()){
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("id"));
        }
    }
}