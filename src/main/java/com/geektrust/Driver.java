package com.geektrust;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.geektrust.allies.BuildAllies;
import com.geektrust.dao.KingdomEmblem;
import com.geektrust.dao.impl.KingdomEmblemLoader;

public class Driver {
	public static void main(String args[]) {
		try {
			BuildAllies buildAllies = new BuildAllies(Files.readAllLines(Paths.get("/Users/pradipmudi/eclipse-workspace/geektrust/src/input3.txt")));
			List<String> allies = buildAllies.buildAllyList();
			
			// if ruler did not got 3 or more allies
			if(allies.size()<3)
				System.out.println("NONE");
			else {
				System.out.print("SPACE");
				for(String ally : allies) {
					System.out.print(" "+ally);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
