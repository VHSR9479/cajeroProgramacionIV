package com.edu.uniajc.cajero.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Session;


import co.edu.uniajc.CajeroAutomatico.Service.BancoServiceImp;
import co.edu.uniajc.CajeroAutomatico.Util.HibernateUtil;
import co.edu.uniajc.CajeroAutomatico.model.Banco;






@ManagedBean(name = "bancoBean", eager = true)
@RequestScoped
public class BancoManagedBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String SUCCESS = "success";
    private static final String ERROR   = "error";
    private String nit, nombre, telefono, direccion;
    private List<Banco> lista = new ArrayList<>();
    private BancoServiceImp bancoServices;

//    //Spring Customer Service is injected...
//    @ManagedProperty(value="#{BancoService}")




	public BancoManagedBean() {
			Session session = HibernateUtil.getSessionFactory().openSession();
			BancoServiceImp BancoService = new BancoServiceImp(session);
			bancoServices = new BancoServiceImp(session);
			BancoService.closeSession();
	
	}
  
	
	public void buttonAction() {
		bancoServices.addBanco(new Banco(nit,nombre,direccion,telefono));
		addMessage("Datos de usuario enviados!! Descripcion: " + nit);
		
		
		
	}
	
	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public void cancelar(){
		System.out.println("Cancelar..");
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Banco> getLista() {
		return lista;
	}

	public void setLista(List<Banco> lista) {
		this.lista = lista;
	}

	public BancoServiceImp getBancoServices() {
		return bancoServices;
	}

	public void setBancoServices(BancoServiceImp bancoServices) {
		this.bancoServices = bancoServices;
	}



    
}