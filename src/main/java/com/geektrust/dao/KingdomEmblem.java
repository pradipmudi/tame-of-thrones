package com.geektrust.dao;

public class KingdomEmblem {
	String name;
	String emblem;
	String encryptedEmblem;

	public String getEncryptedEmblem() {
		return encryptedEmblem;
	}
	public void setEncryptedEmblem(String encryptedEmblem) {
		this.encryptedEmblem = encryptedEmblem;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmblem() {
		return emblem;
	}
	public void setEmblem(String emblem) {
		this.emblem = emblem;
	}
	
	@Override
	public String toString() {
		return "KingdomEmblem [name=" + name + ", emblem=" + emblem + ", decryptedEmblem=" + encryptedEmblem + "]";
	}

}
