package com.reno.blue.cuentas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reno.blue.cuentas.model.Quincena;
import com.reno.blue.cuentas.repository.QuincenaRepository;
import com.reno.blue.cuentas.service.QuincenaService;

@Service
public class QuincenaServiceImpl implements QuincenaService {

	@Autowired
	private QuincenaRepository gastoRepository;

	public Iterable<Quincena> findAll() {
		return gastoRepository.findAll();
	}

	public Long create(Quincena gasto) {
		gastoRepository.save(gasto);
		return gasto.getId();
	}

	public Quincena update(Long id, Quincena gasto) {
		Quincena gastoDb = gastoRepository.findOne(id);
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
