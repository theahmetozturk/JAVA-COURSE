package MainLayer.business;

import java.util.List;

import MainLayer.dataAccess.CourseDao;
import MainLayer.dataAccess.HibernateDao;
import MainLayer.dataAccess.JdbcDao;
import MainLayer.entities.Course;
import MainLayer.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;

	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}

		for (Course co : courseDao.getCourses()) {
			if (co.getName().equals(course.getName())) {
				throw new Exception("Kurs isimleri aynı olamaz");
			}

			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		}
		courseDao.add(course);
	}

}
