package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.database.DbUtil;
import com.amdocs.training.model.User;

public class UserImpl implements UserDAO {
	
	Connection conn = DbUtil.getConnection();
	
public boolean saveUser(User user) {
		
		String query = "insert into user values(?,?,?,?,?,?,?,?)";
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getRegDate());
			ps.setString(4, user.getAddress());
			ps.setString(5, user.getEmail());
			ps.setString(6, user.getPassword());
			ps.setLong(7, user.getPhone());
			ps.setString(8,user.getUploadPhoto());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return false;
	}

}

