package co.edu.uniajc.CajeroAutomatico.model;
// Generated 7/04/2019 12:54:01 PM by Hibernate Tools 5.1.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

	private Integer idUsuario;
	private TipoIdentificacion tipoIdentificacion;
	private String identificacion;
	private String nombre;
	private String apellido;
	private String direccion;
	private String celular;
	private String email;
	private Date fecCreacion;
	private Date fecActualiza;
	private Set cuentas = new HashSet(0);

	public Usuario() {
	}

	public Usuario(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public Usuario(TipoIdentificacion tipoIdentificacion, String identificacion, String nombre, String apellido,
			String direccion, String celular, String email, Date fecCreacion, Date fecActualiza, Set cuentas) {
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.celular = celular;
		this.email = email;
		this.fecCreacion = fecCreacion;
		this.fecActualiza = fecActualiza;
		this.cuentas = cuentas;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public TipoIdentificacion getTipoIdentificacion() {
		return this.tipoIdentificacion;
	}

	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecCreacion() {
		return this.fecCreacion;
	}

	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}

	public Date getFecActualiza() {
		return this.fecActualiza;
	}

	public void setFecActualiza(Date fecActualiza) {
		this.fecActualiza = fecActualiza;
	}

	public Set getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(Set cuentas) {
		this.cuentas = cuentas;
	}

}
