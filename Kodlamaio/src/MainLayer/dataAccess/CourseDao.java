package MainLayer.dataAccess;

import java.util.List;

import MainLayer.entities.Course;

public interface CourseDao {
	void add(Course course);
	List <Course> getCourses();
}
