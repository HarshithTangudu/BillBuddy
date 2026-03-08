import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "Harshith@25*";

        try {

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL!");

            Statement stmt = conn.createStatement();

            String query = "INSERT INTO student VALUES (2,'Harshith',95)";
            stmt.executeUpdate(query);

            System.out.println("Data inserted successfully!");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}