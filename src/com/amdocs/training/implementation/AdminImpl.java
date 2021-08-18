package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.database.DbUtil;
import com.amdocs.training.model.Admin;

public class AdminImpl implements AdminDAO{

	Connection conn = DbUtil.getConnection();
	
	/* (non-Javadoc)
	 * @see com.amdocs.training.dao.AdminDAO#addAdmin(com.amdocs.training.model.Admin)
	 */
	public boolean addAdmin(Admin admin) {
		
		String query  = "insert into admin values(?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, admin.getAdminId());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getEmail());
			ps.setString(4,admin.getPassword());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
