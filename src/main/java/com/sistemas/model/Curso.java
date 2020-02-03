package com.sistemas.model;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="curso")
public class Curso {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCurso;
	
	@Column(name = "abreviatura", nullable = false, length = 10)
	private String abreviatura;
	
	@Column(name="costo", nullable = false)
	private BigDecimal costo;
	
	@Column(name = "descripcion", nullable = false, length = 300)
	private String descripcion;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "credito", nullable = false)
	private int credito;
	
	@Column(name = "estado")
	private String estado;
	
	@Column (name="tiempo_duracion")
	private String tiempoDuracion;

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTiempoDuracion() {
		return tiempoDuracion;
	}

	public void setTiempoDuracion(String tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}
	
	
}
