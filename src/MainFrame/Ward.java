package MainFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ward extends mysqlconnection {

	static int exec;
	static int currentpatients;
	static int updatedpatients;
	static int availablebeds;
	static int updatedbeds;
	static int assignedbeds;
	static int Capacity;
	static int Patients;
	static int Availablebeds;
	static float percentageoccupancy;
	int wid = 0;

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);

	public Ward(int wid) throws SQLException {
		Capacity = Ward.capacity(wid);
		Patients = Ward.assignedbeds(wid);
		Availablebeds = Ward.availablebeds(wid);

		getdata(wid);

	}

	public static int capacity(int wid) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);
		int capacity = 0;

		PreparedStatement stmt;
		stmt = con.prepareStatement("select capacity from ward where wid = ? ");
		stmt.setInt(1, wid);
		ResultSet Rs = stmt.executeQuery();

		while (Rs.next()) {
			capacity = Rs.getInt("capacity");
		}

		return capacity;

	}

	public static int currentpatients(int wid) throws SQLException {

		int currentpatients = 0;

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);

		PreparedStatement stmt;
		stmt = con.prepareStatement("select assignedbeds  from ward where wid = ? ");
		stmt.setInt(1, wid);
		ResultSet Rs = stmt.executeQuery();

		while (Rs.next()) {
			currentpatients = Rs.getInt("assignedbeds");
		}
		return currentpatients;

	}

	public static int availablebeds(int wid) throws SQLException {
		int availablebeds = 0;

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);

		PreparedStatement stmt;
		stmt = con.prepareStatement("select availablebeds  from ward where wid = ?  ");
		stmt.setInt(1, wid);
		ResultSet Rs = stmt.executeQuery();

		while (Rs.next()) {
			availablebeds = Rs.getInt("availablebeds");
		}

		return availablebeds;

	}

	public static int assignedbeds(int wid) throws SQLException {
		int assignedbeds = 0;

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);

		PreparedStatement stmt;
		stmt = con.prepareStatement("select assignedbeds  from ward where wid = ?  ");
		stmt.setInt(1, wid);
		ResultSet Rs = stmt.executeQuery();

		while (Rs.next()) {
			assignedbeds = Rs.getInt("assignedbeds");
		}

		return assignedbeds;

	}

	public static void incrementassignedbeds(int wid) throws SQLException {

		assignedbeds = Ward.assignedbeds(wid);

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);
		PreparedStatement stmt;
		assignedbeds = assignedbeds + 1;

		stmt = con.prepareStatement("update ward set assignedbeds  =  ? where wid = ?");
		stmt.setInt(1, assignedbeds);
		stmt.setInt(2, wid);
		exec = stmt.executeUpdate();

	}

	public static void decrementassignedbeds(int wid) throws SQLException {

		assignedbeds = Ward.assignedbeds(wid);

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);
		PreparedStatement stmt;
		assignedbeds = assignedbeds - 1;

		stmt = con.prepareStatement("update ward set assignedbeds  =  ? where wid = ?");
		stmt.setInt(1, assignedbeds);
		stmt.setInt(2, wid);
		exec = stmt.executeUpdate();

	}

	public static void incrementavailablebeds(int wid) throws SQLException {

		availablebeds = Ward.availablebeds(wid);

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);
		PreparedStatement stmt;
		updatedbeds = availablebeds + 1;

		stmt = con.prepareStatement("update ward set availablebeds  =  ? where wid = ?");
		stmt.setInt(1, updatedbeds);
		stmt.setInt(2, wid);
		exec = stmt.executeUpdate();

	}

	public static void decrementavailablebeds(int wid) throws SQLException {
		availablebeds = Ward.availablebeds(wid);

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipd", "root", null);

		PreparedStatement stmt;
		availablebeds = availablebeds - 1;

		stmt = con.prepareStatement("update ward set availablebeds  =  ? where wid = ?");

		stmt.setInt(1, availablebeds);
		stmt.setInt(2, wid);
		exec = stmt.executeUpdate();

	}

	public void admitpatient(int wid) throws SQLException {

		currentpatients = Ward.currentpatients(wid);

		Ward.decrementavailablebeds(wid);
		Ward.incrementassignedbeds(wid);

	}

	public void dischargepatient(int wid) throws SQLException {

		Ward.incrementavailablebeds(wid);
		Ward.decrementassignedbeds(wid);

	}

	public static float percentageOccupancy(int wid) throws SQLException {

		float assignedbeds = Ward.assignedbeds(wid);

		float Capacity = Ward.capacity(wid);

		percentageoccupancy = (assignedbeds / Capacity) * 100;

		return percentageoccupancy;

	}

	public static int[] getdata(int wid) throws SQLException {

		Capacity = Ward.capacity(wid);
		Patients = Ward.assignedbeds(wid);
		Availablebeds = Ward.availablebeds(wid);
		percentageoccupancy = Ward.percentageOccupancy(wid);

		int[] data = { Capacity, Patients, Availablebeds, (int) percentageoccupancy };

		return data;

	}

}
