package co.edu.uniajc.cajero.model;

import java.io.Serializable;
import java.sql.*;

public class BancoDTO implements Serializable {
		private Integer idBanco;
		private String nit;
		private String nombre;
		private String direccion;
		private String telefono;
		
		
		public Integer getIdBanco() {
			return idBanco;
		}
		public void setIdBanco(Integer idBanco) {
			this.idBanco = idBanco;
		}
		public String getNit() {
			return nit;
		}
		public void setNit(String nit) {
			this.nit = nit;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		

	}


