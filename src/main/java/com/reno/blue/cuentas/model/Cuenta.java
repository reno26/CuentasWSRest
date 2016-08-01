package com.reno.blue.cuentas.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.reno.blue.cuentas.enums.TipoCuenta;

@Entity
@Table(name = "cuenta")
public class Cuenta {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private TipoCuenta tipoCuenta;

	@Column(nullable = false)
	private String concepto;

	@Column(nullable = false)
	private String persona;

	@Column(nullable = false)
	private BigDecimal cantidad;

	@Column(nullable = false)
	private BigDecimal pagado;

	@Column(nullable = false)
	private int numeroPago;

	@Column(nullable = false)
	private int totalPagos;

	@Column(nullable = false)
	private String observacion;
	
	@ManyToOne
	@JoinColumn(name="QUINCENA_ID")
	private Quincena quincena;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPagado() {
		return pagado;
	}

	public void setPagado(BigDecimal pagado) {
		this.pagado = pagado;
	}

	public int getNumeroPago() {
		return numeroPago;
	}

	public void setNumeroPago(int numeroPago) {
		this.numeroPago = numeroPago;
	}

	public int getTotalPagos() {
		return totalPagos;
	}

	public void setTotalPagos(int totalPagos) {
		this.totalPagos = totalPagos;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
