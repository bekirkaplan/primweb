package tr.com.dao;

import java.util.List;

import tr.com.entities.Grup;

public interface GrupDao{

	public Grup saveOrUpdate(Grup entity);
	
	public List<Grup> getAll();

}