package tr.com.dao;

import java.util.List;

import tr.com.entities.Havuz;

public interface HavuzDao{

	public Havuz saveOrUpdate(Havuz entity);
	
	public List<Havuz> getAll();

}