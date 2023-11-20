package com.tutorar.enums;

public enum Tipo_aula {
	individual("Aula individual"),
	grupo("Aula em grupo"),
	workshop("Workshop"),
	palestra("Palestra"),
	capacitacao("Capacitação");
	
	private String tpAula;
	Tipo_aula(String tpAula) {
		this.tpAula = tpAula;
	}
	
	public String getTpAula() {
		return tpAula;
	}
	
	public void setTpAula(String tpAula) {
		this.tpAula = tpAula;
	}
}
