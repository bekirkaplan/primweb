package tr.com.dao;

import java.util.List;

import tr.com.entities.Person;

public interface PersonDao{

	public Person saveOrUpdate(Person entity);
	
	public List<Person> getAll();

	public void deleteById(Person prim);
}
