package MainLayer.dataAccess;

import java.util.ArrayList;
import java.util.List;

import MainLayer.entities.Catagory;
import MainLayer.entities.Course;
import MainLayer.entities.Instructor;

public class HibernateDao implements CourseDao, CatagoryDao, InstructorDao {

	public List<Course> courses;
	public List<Catagory> catagories;

	public HibernateDao() {
		courses = new ArrayList<>();
		catagories = new ArrayList<>();
	}

	public void add(Course course) {
		courses.add(course);
		System.out.println("Hibernate ile veritabanına eklendi");
	}

	public void add(Catagory catagory) {
		catagories.add(catagory);
		System.out.println("Hibernate ile veritabanına eklendi");
	}

	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi");
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
