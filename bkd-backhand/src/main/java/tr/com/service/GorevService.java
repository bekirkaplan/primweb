package tr.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tr.com.dao.GorevDao;
import tr.com.dao.PrimDao;
import tr.com.entities.Gorev;
import tr.com.entities.Prim;

@Service
@EnableTransactionManagement
public class GorevService {

	@Autowired
	GorevDao gorevDao;

	public void saveOrUpdate(Gorev gorev) {
		gorevDao.saveOrUpdate(gorev);
	}

	public List<Gorev> getAll() {
		return gorevDao.getAll();
	}

	public void deleteById(Gorev gorev) {
		gorevDao.deleteById(gorev);		
	}
}