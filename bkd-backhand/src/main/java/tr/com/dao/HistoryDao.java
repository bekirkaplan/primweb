package tr.com.dao;

import java.util.List;

import tr.com.entities.History;

public interface HistoryDao{

	public History saveOrUpdate(History entity);
	
	public List<History> getAll();

}
