package com.reno.blue.cuentas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reno.blue.cuentas.model.Gasto;
import com.reno.blue.cuentas.service.GastoRepository;
import com.reno.blue.cuentas.service.GastoService;

@Service
public class GastoServiceImpl implements GastoService {

	@Autowired
	private GastoRepository gastoRepository;

	public Iterable<Gasto> findAll() {
		return gastoRepository.findAll();
	}

	public Long create(Gasto gasto) {
		gastoRepository.save(gasto);
		return gasto.getId();
	}

	public Gasto update(Long id, Gasto gasto) {
		Gasto gastoDb = gastoRepository.findOne(id);
		if (gastoDb == null) {
			throw new IllegalStateException("No gasto with: " + id);
		}
		gasto.setId(gastoDb.getId());
		return gastoRepository.save(gasto);
	}

	public void delete(Long id) {
		gastoRepository.delete(id);
	}

}
