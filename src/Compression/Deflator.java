package Compression;

import java.io.UnsupportedEncodingException;
import java.util.zip.Deflater;

public class Deflator {
	
	public static String Deflate(String input) throws UnsupportedEncodingException {
		Deflater d = new Deflater();
		d.setInput(input.getBytes("UTF-8"));
		d.finish();
		byte output[] = new byte[1024];
        int size = d.deflate(output);
        System.out.println("Compression: " + (double)Math.round((double)size/(double)input.length()*1000)/10 + "% | Original: " + input.length() + " | Compressed: " + size);
        d.end();
		return new String(output).substring(0, size);
	}

}
