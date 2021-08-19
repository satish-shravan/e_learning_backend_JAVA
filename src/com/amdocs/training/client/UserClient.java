package com.amdocs.training.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.implementation.AdminImpl;
import com.amdocs.training.implementation.ContactImpl;
import com.amdocs.training.implementation.CourseImpl;
import com.amdocs.training.implementation.FeedbackImpl;
import com.amdocs.training.implementation.UserImpl;
import com.amdocs.training.model.Admin;
import com.amdocs.training.model.Contact;
import com.amdocs.training.model.Course;
import com.amdocs.training.model.Feedback;
import com.amdocs.training.model.User;

public class UserClient {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Choose number :");
		System.out.println("1.USER /t 2.Contact/t 3.Feedback/t 4.Course/t 5.Admin ");
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in) );
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num)
		{
		     case 1 :
		    	 User user = new User(1, "SATISH" , "02/08/2021" , "PUNE" , "satish@amdocs.com" , "12345678" ,9075794792L,"img.jpg");

		 		UserDAO dao = (UserDAO) new UserImpl();
		 		
		 		boolean update = dao.saveUser(user);
		 		
		 		if(update)
		 		{
		 			System.out.println("Data Added!");
		 		}
		 		break;
		 		
		     case 2 :
		    	 Contact contact = new Contact(1, 11, "c1", "hi", "c1@gmail.com", 9090909090L);
		    	 
		    	 ContactDAO contactDao = new ContactImpl();
		    	 
		    	 boolean status = contactDao.addContact(contact);
		    	 
		    	 if(status)
		    		 System.out.println("saved contact");
		    	 
		    	 break;
		    	
		     case 3: 
		    	 Feedback fb = new Feedback(1,101,"fb1","hiii all!","fb1@gmail.com");
		    	 
		    	 FeedbackDAO fbDao = new FeedbackImpl();
		    	 
		    	 boolean fb_status = fbDao.addFeedback(fb);
		    	 
		    	 if(fb_status)
		    		 System.out.println("saved feedback");
		    	 
		    	 break;
		    	 
		     case 4: 
		    	 Course course = new Course(11,"java","jdbc",14999.0,"java.mp4");
		    	 
		    	 CourseDAO courseDao = new CourseImpl();
		    	 
		    	 boolean course_status = courseDao.addCourse(course);
		    	 
		    	 if(course_status)
		    		 System.out.println("saved course");
		    	 
		    	 break;
		    	 
		     case 5: 
		    	 Admin admin = new Admin(21, "admin", "admin@gmail.com", "12121212");
		    	 
		    	 AdminDAO adminDao = new AdminImpl();
		    	 
		    	 boolean admin_status = adminDao.addAdmin(admin);
		    	 
		    	 if(admin_status)
		    		 System.out.println("saved admin");
		    	 
		    	 break;
		    	 
		    default :
		    	System.out.println("invalid");
		}
		
		
		

		
	}

}
