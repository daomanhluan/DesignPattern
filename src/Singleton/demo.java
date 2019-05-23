package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	
	private static DatabaseConnection instance;
	private String username = "root";
	private String password = "root";
	private Connection connection;
	
	private DatabaseConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/dambaoduan",username,password);  
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public static DatabaseConnection getInstance() {
		try {
			if(instance == null || instance.getConnection().isClosed()) {
				instance = new DatabaseConnection();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return instance;
	}
}
