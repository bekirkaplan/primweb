package tr.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.dao.PersonDao;
import tr.com.entities.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDAO;

	public void addPerson(Person person) {
		personDAO.saveOrUpdate(person);
	}

	public List<Person> getAllPerson() {
		List<Person> personList = personDAO.getAll();
		return personList;
	}

}
