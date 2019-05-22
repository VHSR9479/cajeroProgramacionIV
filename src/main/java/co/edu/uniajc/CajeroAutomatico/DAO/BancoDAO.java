package co.edu.uniajc.CajeroAutomatico.DAO;

import java.util.List;


import co.edu.uniajc.CajeroAutomatico.model.Banco;

public interface BancoDAO {
	
	public void addBanco(Banco banco);
	
	
public List<Banco> obtenerBancos();	
	

	


}
