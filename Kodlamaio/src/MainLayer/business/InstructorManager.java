package MainLayer.business;

import java.util.List;

import MainLayer.dataAccess.InstructorDao;
import MainLayer.dataAccess.HibernateDao;
import MainLayer.dataAccess.JdbcDao;
import MainLayer.entities.Instructor;
import MainLayer.logging.Logger;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
		
	}
}
