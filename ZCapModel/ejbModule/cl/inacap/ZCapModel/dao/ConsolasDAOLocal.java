package cl.inacap.ZCapModel.dao;

import javax.ejb.Local;

@Local
public interface ConsolasDAOLocal {
	
	void save(Consola consola);
	List<Consola> getAll();
	void delete(Consola consola);
	List<Consola> filterByName(String nombre):

}
