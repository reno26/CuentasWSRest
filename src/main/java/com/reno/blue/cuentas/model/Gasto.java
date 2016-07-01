package com.reno.blue.cuentas.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "gasto")
public class Gasto {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String concepto;

	@Column(nullable = false)
	private int frecuencia;

	@Column(nullable = false)
	private BigDecimal cantidad;

	@Column(nullable = false)
	private boolean diario;

	@Transient
	private BigDecimal quincenal;

	@Transient
	private BigDecimal mensual;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isDiario() {
		return diario;
	}

	public void setDiario(boolean diario) {
		this.diario = diario;
	}

	public BigDecimal getQuincenal() {
		return quincenal;
	}

	public void setQuincenal(BigDecimal quincenal) {
		this.quincenal = quincenal;
	}

	public BigDecimal getMensual() {
		return mensual;
	}

	public void setMensual(BigDecimal mensual) {
		this.mensual = mensual;
	}

}
