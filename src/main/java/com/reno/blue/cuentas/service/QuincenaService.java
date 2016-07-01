package com.reno.blue.cuentas.service;

import com.reno.blue.cuentas.model.Quincena;

public interface QuincenaService {
	Iterable<Quincena> findAll();
	Long create(Quincena cuenta);
	Quincena update(Long id, Quincena cuenta);
	void delete(Long id);
}
