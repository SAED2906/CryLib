package crylib;

import java.util.Base64;

public class toBase64 {
	
	public static String Ecr(String input) {
		return Base64.getEncoder().encodeToString(input.getBytes());
	}
	
	public static String Dcr(String input) {
		byte[] bytes = Base64.getDecoder().decode(input);
		return new String(bytes);
	}

}
