package cl.inacap.ZCapModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.ZCapModel.dto.Juego;

@Local
public interface JuegosDAOLocal {
	
	void save (Juego juego);
	List<Juego> getAll();
	void delete(Juego juego);
	List<Juego> findByName(String Nombre);
	

}
