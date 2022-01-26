package crylib;

import java.io.UnsupportedEncodingException;

import Compression.Deflator;
import encryption.XOR;

public class MAIN {

	static String str = "";
	public static void main (String[]args) throws UnsupportedEncodingException {
		
		BlockDistribution.block_div(toBase64.Ecr(new toBinary(1234567890).getFinal()));
		
		BlockDistribution.Blocks.forEach((block) -> {
			str += block;
		});
		
		//Still need to shuffle
		
		System.out.println(XOR.stringXor(Deflator.Deflate(str), "2000"));
		
		
	}
}
