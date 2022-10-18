package MainLayer;

import MainLayer.business.CatagoryManager;
import MainLayer.business.CourseManager;
import MainLayer.business.InstructorManager;
import MainLayer.dataAccess.HibernateDao;
import MainLayer.dataAccess.JdbcDao;
import MainLayer.entities.Catagory;
import MainLayer.entities.Course;
import MainLayer.entities.Instructor;
import MainLayer.logging.DataBaseLogger;
import MainLayer.logging.FileLogger;
import MainLayer.logging.Logger;
import MainLayer.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "Java", 100);
		Course course2 = new Course(2, "Python", 50);

		Catagory catagory1 = new Catagory(1, "Full stack");
		Catagory catagory2 = new Catagory(2, "Programlamaya giriş");

		Instructor instructor = new Instructor(1, "Ahmet");

		Logger[] loggers = { new DataBaseLogger(), new FileLogger(), new MailLogger() };
		
		HibernateDao hibernate = new HibernateDao();
		
		CourseManager courseManager = new CourseManager(hibernate, loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		
		CatagoryManager catagoryManager = new CatagoryManager(hibernate, loggers);
		catagoryManager.add(catagory1);
		catagoryManager.add(catagory2);
		
		InstructorManager instructorManager = new InstructorManager(hibernate, loggers);
		instructorManager.add(instructor);
		
	}

}
