package tr.com.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import tr.com.dao.PersonDao;
import tr.com.entities.Person;
import tr.com.util.GenericHibernateDAO;


@Repository
@Transactional
public class PersonDaoImpl extends GenericHibernateDAO<Person, Long> implements PersonDao{
	
	public Person saveOrUpdate(Person person) {
		getSession().save(person);
		return person;
	}

	@SuppressWarnings("unchecked")
	public List<Person> getAll() {
		Criteria criteria = getSession().createCriteria(Person.class);
		List<Person> persons = (List<Person>) criteria.list();
		return persons;
	}
	
	@Override
	public void deleteById(Person person) {
		getSession().delete(person);
	}
}
