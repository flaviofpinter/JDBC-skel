import java.sql.*;

public class DAO {
    public static void main(String[] args) throws SQLException {
        //database URL and user info.
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/lab1", "flavio", "password");
        //Creates statement.
        Statement statement = conn.createStatement();
        //Executes query.
        ResultSet rs = statement.executeQuery("SELECT * FROM Cursos");
        //Moves the cursor to the first row.
        rs.first();
        //Prints the first column and first row value.
        System.out.println(rs.getString(1));
    }
}
