package dao;

import java.util.List;

public interface DAO<T> {
	T findById(Integer id);
	List<T> findAll();
	Boolean update(T t);
	Boolean save(T t);
	Boolean delete(T t);
}
