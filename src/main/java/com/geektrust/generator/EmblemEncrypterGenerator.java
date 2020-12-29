package com.geektrust.generator;

import java.util.HashMap;
import java.util.Map;

import com.geektrust.dao.KingdomEmblem;

public class EmblemEncrypterGenerator {
	
	Map<String, String> kingdomEmblemsMap = null;
	Map<String, KingdomEmblem> kingdomEmblemEncryptedMap = null;
	
	public EmblemEncrypterGenerator() {		
		kingdomEmblemEncryptedMap = new HashMap<String, KingdomEmblem>();
		kingdomEmblemsMap = new HashMap<String, String>();
		kingdomEmblemsMap.put("SPACE", "Gorrila");
		kingdomEmblemsMap.put("LAND", "Panda");
		kingdomEmblemsMap.put("WATER", "Octopus");
		kingdomEmblemsMap.put("ICE","Mammoth");
		kingdomEmblemsMap.put("AIR", "Owl");
		kingdomEmblemsMap.put("FIRE", "Dragon");
	}

	public Map<String, KingdomEmblem> generateAndLoadEncryptions() {
		KingdomEmblem kingdomEmblem = null;
		String emblem;
		for(String kingdom : kingdomEmblemsMap.keySet()) {
			emblem = kingdomEmblemsMap.get(kingdom);
			kingdomEmblem = new KingdomEmblem();
			kingdomEmblem.setName(kingdom);
			kingdomEmblem.setEmblem(emblem);
			kingdomEmblem.setEncryptedEmblem(encryptedEmblem(emblem.toUpperCase(), emblem.length()));
			
			kingdomEmblemEncryptedMap.put(kingdom, kingdomEmblem);
			
		}
		return kingdomEmblemEncryptedMap;
	}
	
	public String encryptedEmblem(String emblem, int rotation) {
		StringBuffer result= new StringBuffer(); 
		  
        for (int i=0; i<emblem.length(); i++) 
        { 
            if (Character.isUpperCase(emblem.charAt(i))) 
            { 
                char ch = (char)(((int)emblem.charAt(i) + 
                                  rotation - 65) % 26 + 65); 
                result.append(ch); 
            } 
            else
            { 
                char ch = (char)(((int)emblem.charAt(i) + 
                                  rotation - 97) % 26 + 97); 
                result.append(ch); 
            } 
        } 
        return result.toString();
	}

}
