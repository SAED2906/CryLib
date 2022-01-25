package crylib;

import java.util.LinkedList;

public class BlockDistribution {
	public static LinkedList<String> Blocks = new LinkedList<>();
	
	
	public static void block_div(String input) {
			for (int loop = 0; input.length()%4 > loop; loop++) {
				input += "-";
			}
			for (int loop = 0; input.length() > loop; loop+=4) {
				Blocks.add(input.substring(loop, loop+4));
			}
		}
		
		
		
		
	}
	

