package Pruebas_Bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld")
@RequestScoped
public class HelloWorld {

	// @ManagedProperty(value = "#{message}") esto se usa en objetos que contengan
	// datos
	private String message = " Hello";


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}