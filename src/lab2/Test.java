package lab2;

import java.io.IOException;
import java.io.InputStream;

public class Test {
	
	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("cmd");
		Process p = pb.start();
		
		InputStream i = p.getInputStream();
		char y;
		while ((y = (char) i.read()) != -1) {
			System.out.print(y);
		}
		i.close();
	}
	
}
