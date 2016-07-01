package com.reno.blue.cuentas.service;

import org.springframework.data.repository.CrudRepository;

import com.reno.blue.cuentas.model.Cuenta;

public interface CuentaRepository extends CrudRepository<Cuenta, Long>{

}
