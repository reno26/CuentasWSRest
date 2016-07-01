package com.reno.blue.cuentas.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.reno.blue.cuentas.enums.Periodo;

@Entity
@Table(name = "quincena")
public class Quincena {

	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(mappedBy = "quincena",cascade = CascadeType.ALL)
	private Set<Cuenta> cuentas;

	@Column(nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private Periodo periodo;

	@Column(nullable = false)
	private int anio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Set<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
