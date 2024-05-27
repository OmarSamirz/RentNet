import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Database instance;
    private Connection con;

    private Database() {
        try {
            String url = "jdbc:postgresql://localhost:5432/java_test";
            String username = "postgres";
            String password = "ayman792003";

            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to PostgreSQL has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Database getInstance() {
        Database result = instance;

        if (result == null) {
            synchronized (Database.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Database();
                }
            }
        }
        return result;
    }

    public ResultSet query(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {

        Database db = Database.getInstance();
        ResultSet rs = db.query("SELECT * FROM mytable");

        try {
            while (rs != null && rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

