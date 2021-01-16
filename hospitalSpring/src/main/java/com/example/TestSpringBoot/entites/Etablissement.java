package com.example.TestSpringBoot.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etablissement {
	private String code; 
	private String nom;
	private String categorie;
	private String reseau;
	private String cs;
	private String province;
	private String region;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long objectId;
	private float longitude;
	private float latitude;
	public Etablissement(String code, String nom, String categorie, String reseau, String cs, String province,
			String region, float longitude, float latitude) {
		super();
		this.code = code;
		this.nom = nom;
		this.categorie = categorie;
		this.reseau = reseau;
		this.cs = cs;
		this.province = province;
		this.region = region;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public Etablissement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getReseau() {
		return reseau;
	}
	public void setReseau(String reseau) {
		this.reseau = reseau;
	}
	public String getCs() {
		return cs;
	}
	public void setCs(String cs) {
		this.cs = cs;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public long getObjectId() {
		return objectId;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	
	

}
