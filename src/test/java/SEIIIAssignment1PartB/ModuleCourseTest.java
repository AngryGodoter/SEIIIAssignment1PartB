package SEIIIAssignment1PartB;


import org.joda.time.DateTime;

import SEIIIAssignment1.*;
import SEIIIAssignment1.Module;

public class ModuleCourseTest {

	public static void main(String[] args)
	{
		//add some students
		Student s1 = new Student("DavidSwain", 20, new DateTime("2002-09-12"), 1, null, null);
		Student s2 = new Student("KarlBuck", 21, new DateTime("2001-02-11"), 2, null, null);
		Student s3 = new Student("JoelNope", 20, new DateTime("2002-01-10"), 3, null, null);
		Student s4 = new Student("SanderMullen", 21, new DateTime("2001-03-15"), 4, null, null);
		Student[] group1 = {s1, s2, s4};
		Student[] group2 = {s1, s3};
		Student[] all = {s1, s2, s3, s4};
		//create some lecturers
		Lecturer l1 = new Lecturer("BakeFenney", 42, new DateTime("1980-04-09"), 1, null);
		Lecturer l2 = new Lecturer("CollonShannon", 45, new DateTime("1977-08-20"), 2, null);
		//add a course
		Course c1 = new Course("CT", null, all, new DateTime("2019-09-21"), new DateTime("2023-05-01"));
		Course[] course = {c1};
		//create some modules
		Module m1 = new Module("Advanced AI", "CT114", group1, course, l1);
		Module m2 = new Module("Simple AI", "CT999", group2, course, l2);
		Module[] m1Group = {m1};
		Module[] m2Group = {m2};
		Module[] allModules = {m1, m2};
		//assign students with their modules & course
		s1.setCourse(c1);
		s2.setCourse(c1);
		s3.setCourse(c1);
		s4.setCourse(c1);
		s1.setRegisteredModules(m1Group);
		s2.setRegisteredModules(allModules);
		s3.setRegisteredModules(m2Group);
		s4.setRegisteredModules(allModules);
		//assign modules to lecturers and course
		l1.setModulesTeaching(m1Group);
		l2.setModulesTeaching(m2Group);
		c1.setModules(allModules);
		
		//print out all info
		System.out.println("Courses: " + c1.getName() + "\n");
		System.out.println("Associated Modules: ");
		for(int n = 0; n < c1.getModules().length; n++)
		{//print all modules
			System.out.println(c1.getModules()[n].getName());
		}
		System.out.println("\n\nStudent list:");
		for(int m = 0; m < all.length; m++)
		{
			System.out.println("Username: " + all[m].getUsername());
			System.out.println("Picked Modules: ");
			for(int o = 0; o < all[m].getRegisteredModules().length; o++)
			{//print out all modules picked by this student
				System.out.println(all[m].getRegisteredModules()[o].getName());
			}
			System.out.println("Picked Course: " + all[m].getCourse().getName());
			System.out.println("\n");
		}
	}
	
	
}
