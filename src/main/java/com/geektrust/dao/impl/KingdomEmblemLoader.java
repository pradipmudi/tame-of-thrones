package com.geektrust.dao.impl;

import java.util.Map;

import com.geektrust.dao.KingdomEmblem;
import com.geektrust.generator.EmblemEncrypterGenerator;

public class KingdomEmblemLoader {
	Map<String, KingdomEmblem> kingdomEmblemEncryptedMap = null;
	EmblemEncrypterGenerator emblemEncrypterGenerator = null;
	
	public KingdomEmblemLoader() {
		emblemEncrypterGenerator = new EmblemEncrypterGenerator();
		kingdomEmblemEncryptedMap = emblemEncrypterGenerator.generateAndLoadEncryptions();
		
	}
	
	
	public Map<String, KingdomEmblem> getKingdomEmblemEncryptedMap() {
		return kingdomEmblemEncryptedMap;
	}

}
