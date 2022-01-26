package encryption;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class XOR {
	
	public static String stringXor(String input, String key) {

        String finalstr = null;
        byte[] mb = input.getBytes();
        byte[] kb = key.getBytes();
        ByteArrayOutputStream Stream = new ByteArrayOutputStream(mb.length);
        int x = 0;

	        for (int i = 0; i < mb.length; i++) {
	            byte mByte = mb[i];
	            byte kByte = kb[x];
	            byte xorProd = (byte) (mByte ^ kByte);
	
	            if (x < kb.length - 1) {
	            	x++;
	            }else{
	            	x = 0;
	            }
	
	            Stream.write(xorProd);
	        }

        try {
        	Stream.flush();
            finalstr = Stream.toString();
            Stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return finalstr;
    }

}
