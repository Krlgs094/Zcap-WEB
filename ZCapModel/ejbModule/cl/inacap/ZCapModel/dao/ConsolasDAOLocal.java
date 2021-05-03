package cl.inacap.ZCapModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.ZCapModel.dto.Consola;

@Local
public interface ConsolasDAOLocal {
	
	void save(Consola consola);
	List<Consola> getAll();
	void delete(Consola consola);
	List<Consola> filterByName(String nombre);

}
