package Smoelenboek.smoelenboek.domein;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Collega {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String voornaam;
	private String achternaam;
	private String email;
	private String telefoonnummer;
	private String woonplaats;
	private String teamsoort;
	private String teamnaam;
	private String rol;
	private String werkzaamheden;
	private String specialiteiten;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVoornaam() {
		return voornaam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	public String getAchternaam() {
		return achternaam;
	}
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefoonnummer() {
		return telefoonnummer;
	}
	public void setTelefoonnummer(String telefoonnummer) {
		this.telefoonnummer = telefoonnummer;
	}
	public String getWoonplaats() {
		return woonplaats;
	}
	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}
	public String getTeamsoort() {
		return teamsoort;
	}
	public void setTeamsoort(String teamsoort) {
		this.teamsoort = teamsoort;
	}
	public String getTeamnaam() {
		return teamnaam;
	}
	public void setTeamnaam(String teamnaam) {
		this.teamnaam = teamnaam;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getWerkzaamheden() {
		return werkzaamheden;
	}
	public void setWerkzaamheden(String werkzaamheden) {
		this.werkzaamheden = werkzaamheden;
	}
	public String getSpecialiteiten() {
		return specialiteiten;
	}
	public void setSpecialiteiten(String specialiteiten) {
		this.specialiteiten = specialiteiten;
	}
	
	
	
}
