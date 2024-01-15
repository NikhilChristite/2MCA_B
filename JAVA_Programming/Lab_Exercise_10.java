import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SmartGridDatabase {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/smartgrid";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        // Step 1: Load the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading JDBC driver: " + e.getMessage());
            return;
        }

        // Step 2: Establish a connection to the database
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database.");

            // Step 3: Create a table (if not exists)
            createSmartGridTable(connection);

            // Step 4: Insert data into the table
            insertData(connection, "Sensor1", 30.5);

            // Step 5: Retrieve and display data from the table
            retrieveData(connection);

        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }

    private static void createSmartGridTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS smartgrid_data (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "sensor_name VARCHAR(255) NOT NULL," +
                "sensor_value DOUBLE NOT NULL)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL)) {
            preparedStatement.execute();
            System.out.println("Table created (if not exists).");
        }
    }

    private static void insertData(Connection connection, String sensorName, double sensorValue) throws SQLException {
        String insertDataSQL = "INSERT INTO smartgrid_data (sensor_name, sensor_value) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertDataSQL)) {
            preparedStatement.setString(1, sensorName);
            preparedStatement.setDouble(2, sensorValue);
            preparedStatement.executeUpdate();
            System.out.println("Data inserted into the table.");
        }
    }

    private static void retrieveData(Connection connection) throws SQLException {
        String retrieveDataSQL = "SELECT * FROM smartgrid_data";
        try (PreparedStatement preparedStatement = connection.prepareStatement(retrieveDataSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            System.out.println("Retrieved data from the table:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String sensorName = resultSet.getString("sensor_name");
                double sensorValue = resultSet.getDouble("sensor_value");
                System.out.println("ID: " + id + ", Sensor Name: " + sensorName + ", Sensor Value: " + sensorValue);
            }
        }
    }
}
