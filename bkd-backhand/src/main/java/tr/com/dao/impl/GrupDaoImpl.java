package tr.com.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import tr.com.dao.GrupDao;
import tr.com.entities.Grup;
import tr.com.util.GenericHibernateDAO;


@Repository
@Transactional
public class GrupDaoImpl extends GenericHibernateDAO<Grup, Long> implements GrupDao{

	public Grup saveOrUpdate(Grup grup) {
		
		if(grup.getId() != null && grup.getId() != 0l){
			getSession().update(grup);
		} else {
			getSession().save(grup);
		}
		
		return grup;
	}

	@SuppressWarnings("unchecked")
	public List<Grup> getAll() {
		
		Criteria criteria = getSession().createCriteria(Grup.class);
		List<Grup> grup = (List<Grup>) criteria.list();

		return grup;
	}
}
