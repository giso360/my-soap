package com.example.soap.service;


import com.example.soap.pojos.Course;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CourseService {

	public static  List<Course> courses =
										new ArrayList<>();

	static {
		Course c1 = new Course();
		c1.setId(1);
		c1.setName("math");
		c1.setCredits(10);
		Course c2 = new Course();
		c2.setId(2);
		c2.setName("phys");
		c2.setCredits(8);
		courses.add(c1);
		courses.add(c2);
	}

	public Course getCourse (int id) {

		return courses.get(id);
	}


}
