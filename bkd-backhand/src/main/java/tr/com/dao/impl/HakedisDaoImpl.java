package tr.com.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import tr.com.dao.HakedisDao;
import tr.com.entities.Hakedis;
import tr.com.util.GenericHibernateDAO;


@Repository
@Transactional
public class HakedisDaoImpl extends GenericHibernateDAO<Hakedis, Long> implements HakedisDao{

	public Hakedis saveOrUpdate(Hakedis hakedis) {
		
		if(hakedis.getId() != null && hakedis.getId() != 0l){
			getSession().update(hakedis);
		} else {
			getSession().save(hakedis);
		}
		
		return hakedis;
	}

	@SuppressWarnings("unchecked")
	public List<Hakedis> getAll() {
		
		Criteria criteria = getSession().createCriteria(Hakedis.class);
		List<Hakedis> hakedis = (List<Hakedis>) criteria.list();

		return hakedis;
	}
}
