import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseTest {
    @Test
    public void testQuery() {
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
