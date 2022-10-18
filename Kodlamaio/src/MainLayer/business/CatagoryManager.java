package MainLayer.business;

import java.util.List;

import MainLayer.dataAccess.CatagoryDao;
import MainLayer.dataAccess.HibernateDao;
import MainLayer.dataAccess.JdbcDao;
import MainLayer.entities.Catagory;
import MainLayer.logging.Logger;

public class CatagoryManager {
	private CatagoryDao catagoryDao;
	private Logger[] loggers;
	private Catagory[] catagories;

	public CatagoryManager(CatagoryDao catagoryDao, Logger[] loggers) {
		this.catagoryDao = catagoryDao;
		this.loggers = loggers;

	}

	public void add(Catagory catagory) throws Exception {

		for (Catagory ca : catagoryDao.getCatagories()) {
			if (ca.getName().equals(catagory.getName())) {
				throw new Exception("Katagori isimleri aynı olamaz");
			}

			for (Logger logger : loggers) {
				logger.log(catagory.getName());
			}
		}
		catagoryDao.add(catagory);
	}
}
