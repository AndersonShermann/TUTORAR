package com.tutorar.enums;

public enum Plataforma_aula {
	meet("Google Meet"),
	teams("Microsoft Teams"),
	skype("Skype"),
	discord("Discord");
	
	private String platAula;
	Plataforma_aula(String platAula) {
		this.platAula = platAula;
	}
	
	public String getPlatAula() {
		return platAula;
	}
	
	public void setPlatAula(String platAula) {
		this.platAula = platAula;
	}
}
