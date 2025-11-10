import java.sql.Connection;
import java.sql.SQLException;

public class CustomerModel {

    private Connection connection;
    public CustomerModel() {
        try {
            this.connection = DatabaseConnection.getConnection();
        } catch(SQLException e){
            throw new RuntimeException(e);
        }

    }
}
