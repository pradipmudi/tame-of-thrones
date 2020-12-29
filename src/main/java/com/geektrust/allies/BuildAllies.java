package com.geektrust.allies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.geektrust.dao.KingdomEmblem;
import com.geektrust.dao.impl.KingdomEmblemLoader;

public class BuildAllies {
	List<String> allyMessages = null;
	List<String> allies = null;
	KingdomEmblemLoader kingdomEmblemLoader = new KingdomEmblemLoader();
	Map<String, KingdomEmblem> kingdomEmblemsMap = kingdomEmblemLoader.getKingdomEmblemEncryptedMap();
	
	public BuildAllies(List<String> messages) {
		this.allyMessages = messages;
		allies = new ArrayList<String>();
	}
	
	
	public List<String> buildAllyList(){
		for (String message : allyMessages) {
			String kingdom = message.substring(0, message.indexOf(' '));
			String receivedMessage = message.substring(message.indexOf(' ') + 1);
			if(isAlly(kingdom,receivedMessage,kingdom.length(),receivedMessage.length())) {
				allies.add(kingdom);
			}
		}
		return allies;
		
	}
	
	public String sortEmblemMessage(String input) {
		char tempArray[] = input.toCharArray(); 
        
        // sort tempArray 
        Arrays.sort(tempArray);
        
        return new String(tempArray);
	}


	private boolean isAlly(String kingdom, String message, int m, int n) {
		
		KingdomEmblem kingdomEmblem = kingdomEmblemsMap.get(kingdom);
		String encryptedEmblem = sortEmblemMessage(kingdomEmblem.getEncryptedEmblem());
		message = sortEmblemMessage(message);
        
		int j = 0; 
        
        // Traverse message and encryptedEmblem, and compare  
        // current character of message with first 
        // unmatched char of encryptedEmblem, if matched  
        // then move ahead in encryptedEmblem 
        for (int i = 0; i < n && j < m; i++) 
            if (encryptedEmblem.charAt(j) == message.charAt(i)) 
                j++; 
  
        // If all characters of encryptedEmblem were found 
        // in message 
        return (j == m);
		
	}
	
	
	
	
	

	

}
