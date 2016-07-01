package com.reno.blue.cuentas.service;

import com.reno.blue.cuentas.model.Gasto;

public interface GastoService {

	Iterable<Gasto> findAll();
	Long create(Gasto cuenta);
	Gasto update(Long id, Gasto cuenta);
	void delete(Long id);

}
