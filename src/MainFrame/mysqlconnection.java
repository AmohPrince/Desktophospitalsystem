package MainFrame;

import java.sql.Connection;
import java.sql.DriverManager;

public class mysqlconnection {
	public static void sqlconnection(int action) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankaccount");
			con.close();
			System.out.println("We are online");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankaccount", "root", null);
			con.close();
			System.out.println("We are online");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
