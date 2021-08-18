package com.amdocs.training.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.database.DbUtil;
import com.amdocs.training.model.Course;

public class CourseImpl implements CourseDAO {

	Connection conn = DbUtil.getConnection();
	
	@Override
	public boolean addCourse(Course course) {
		
		String query = "insert into course values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, course.getCourseId());
			ps.setString(2, course.getCourseName());
			ps.setString(3, course.getCourseDesc());
			ps.setInt(4, course.getCourseFee());
			ps.setString(5, course.getCourseResource());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
