package com.reno.blue.cuentas.service;

import com.reno.blue.cuentas.model.Cuenta;

public interface CuentaService {
	
	Iterable<Cuenta> findAll();
	
	Long create(Cuenta cuenta);
	
	Cuenta update(Long id, Cuenta cuenta);
	
	void delete(Long id); 

}
