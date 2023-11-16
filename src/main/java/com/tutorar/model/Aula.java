package com.tutorar.model;

import java.sql.Time;
import java.time.format.DateTimeFormatter;

import org.hibernate.annotations.ManyToAny;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Aula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String hr_aula;
	
	@Column
	private float vl_aula;
	
	@Column
	private Date dt_aula;
	
	@Column(nullable = false)
	private String nome_disciplina;
	
	@Column(nullable = false)
	private String categoria;
	
	@Column
	private String descricao;
	
	@Column(nullable = false)
	private String tipo_aula;
	
	@Column
	private String plataforma;

	
	//construtors
	
	public Aula( int id, String hr_aula, float vl_aula, Date dt_aula, String nome_disciplina, 
String categoria, String descricao, String tipo_aula, String plataforma) {
		super();
		this.id = id;
		this.hr_aula = hr_aula;
		this.vl_aula = vl_aula;
		this.dt_aula = dt_aula;
		this.nome_disciplina = nome_disciplina;
		this.categoria = categoria;
		this.descricao = descricao;
		this.tipo_aula = tipo_aula;
		this.plataforma = plataforma;
	}
	
	public Aula() {
		
	}
	
	//getters e setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHr_aula() {
		return hr_aula;
	}

	public void setHr_aula(String hr_aula) {
		this.hr_aula = hr_aula;
	}

	public float getVl_aula() {
		return vl_aula;
	}

	public void setVl_aula(float vl_aula) {
		this.vl_aula = vl_aula;
	}

	public Date getDt_aula() {
		return dt_aula;
	}

	public void setDt_aula(Date dt_aula) {
		this.dt_aula = dt_aula;
	}

	public String getNome_disciplina() {
		return nome_disciplina;
	}

	public void setNome_disciplina(String nome_disciplina) {
		this.nome_disciplina = nome_disciplina;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo_aula() {
		return tipo_aula;
	}

	public void setTipo_aula(String tipo_aula) {
		this.tipo_aula = tipo_aula;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "Aula [id=" + id + ", hr_aula=" + hr_aula + ", vl_aula=" + vl_aula + ", dt_aula=" + dt_aula
				+ ", nome_disciplina=" + nome_disciplina + ", categoria=" + categoria + ", descricao=" + descricao
				+ ", tipo_aula=" + tipo_aula + ", plataforma=" + plataforma + "]";
	}
	
	
}
