package com.reno.blue.cuentas.controller;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriTemplate;

import com.reno.blue.cuentas.model.Cuenta;
import com.reno.blue.cuentas.service.CuentaService;

@RestController
@RequestMapping(value = "/cuenta")
public class CuentaController {
	
	@Autowired
	private CuentaService cuentaService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public Iterable<Cuenta> all() {
		return cuentaService.findAll();
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody Cuenta cuenta, HttpServletRequest request, HttpServletResponse response) {
		Long newId = cuentaService.create(cuenta);
		String requestUrl = request.getRequestURL().toString();
		URI uri = new UriTemplate("{requestUrl}/{id}").expand(requestUrl, newId);
		response.setHeader("Location", uri.toASCIIString());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable Long id, @RequestBody Cuenta cuenta) {
		cuentaService.update(id, cuenta);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		cuentaService.delete(id);
	}

}
