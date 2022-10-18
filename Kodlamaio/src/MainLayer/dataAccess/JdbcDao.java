package MainLayer.dataAccess;

import java.util.ArrayList;
import java.util.List;

import MainLayer.entities.Catagory;
import MainLayer.entities.Course;
import MainLayer.entities.Instructor;

public class JdbcDao implements CourseDao,CatagoryDao,InstructorDao{
	
	public List<Course> courses;
	public List<Catagory> catagories;

	public JdbcDao() {
		courses = new ArrayList<>();
		catagories = new ArrayList<>();
	}
	
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi");
	}

	public void add(Catagory catagory) {
		System.out.println("JDBC ile veritabanına eklendi");
	}

	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi");
	}

	@Override
	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public List<Catagory> getCatagories() {
		return catagories;
	}
}
