package com.bookingapp.dao;

import java.sql.*;
public class LoginDAOImpl implements LoginDAO {

	@Override
	public boolean findCustomerbyUserID(String userId, String password) {
		String sql = "select * from Users where username=? and password=?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		boolean result = false;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, userId);
			statement.setString(2, password);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				result = true;
			}
				
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			DBConnection.closeConnection();
		}
		return result;

	}

}
