package co.edu.uniajc.CajeroAutomatico.Service;

import java.util.List;

import co.edu.uniajc.CajeroAutomatico.model.Banco;

public interface BancoService {
	
	public void addBanco(Banco banco);

	public List<Banco> obtenerBancos();	

}
