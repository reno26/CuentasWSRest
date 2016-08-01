package com.reno.blue.cuentas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reno.blue.cuentas.model.Cuenta;
import com.reno.blue.cuentas.repository.CuentaRepository;
import com.reno.blue.cuentas.service.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService {

	@Autowired
	private CuentaRepository cuentaRepository;

	public Iterable<Cuenta> findAll() {
		return cuentaRepository.findAll();
	}

	public Long create(Cuenta cuenta) {
		cuentaRepository.save(cuenta);
		return cuenta.getId();
	}

	public Cuenta update(Long id, Cuenta cuenta) {
		Cuenta cuentaDb = cuentaRepository.findOne(id);
		if (cuentaDb == null) {
			throw new IllegalStateException("No cuenta with: " + id);
		}
		cuenta.setId(cuentaDb.getId());
		return cuentaRepository.save(cuenta);
	}

	public void delete(Long id) {
		cuentaRepository.delete(id);
	}

}
