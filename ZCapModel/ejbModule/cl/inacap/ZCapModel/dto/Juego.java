package cl.inacap.ZCapModel.dto;

import java.time.LocalDate;

public class Juego {

		private String nombre;
		private String descripcion;
		private boolean aptoNinios;
		private int precios;
		private Consola consola;
		private LocalDate fechadeLanzamiento;
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public boolean isAptoNinios() {
			return aptoNinios;
		}
		public void setAptoNinios(boolean aptoNinios) {
			this.aptoNinios = aptoNinios;
		}
		public int getPrecios() {
			return precios;
		}
		public void setPrecios(int precios) {
			this.precios = precios;
		}
		public LocalDate getFechadeLanzamiento() {
			return fechadeLanzamiento;
		}
		public void setFechadeLanzamiento(LocalDate fechadeLanzamiento) {
			this.fechadeLanzamiento = fechadeLanzamiento;
		}
		public Consola getConsola() {
			return consola;
		}
		public void setConsola(Consola consola) {
			this.consola = consola;
		}
	
}
