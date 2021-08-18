package com.amdocs.training.client;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.implementation.UserImpl;
import com.amdocs.training.model.User;

public class UserClient {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		User user = new User(1, "SATISH" , "02/08/2021" , "PUNE" , "satish@amdocs.com" , "12345678" ,9075794792L,"img.jpg");

		UserDAO dao = (UserDAO) new UserImpl();
		
		boolean update = dao.saveUser(user);
		
		if(update)
		{
			System.out.println("Data Added!");
		}
		

		
	}

}
