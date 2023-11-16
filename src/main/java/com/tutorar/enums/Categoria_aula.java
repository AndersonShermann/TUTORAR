package com.tutorar.enums;

public enum Categoria_aula {
	Reforco("Reforço Escolar"),
	Musica ("Música"),
	Tecnologia("Tecnologia"),
	Artes("Artes"),
	Artesanato("Artesanato"),
	Idiomas("Idiomas"),
	Fundamental("Ensino Fundamental");
	
	private String categoria;
	
	Categoria_aula(String categoria){
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
