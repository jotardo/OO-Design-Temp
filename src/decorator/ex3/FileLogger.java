package decorator.ex3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileLogger implements Logger {

	private String fileName;
	
	public FileLogger(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void log(String msg) {
		try {
			Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(fileName), true)));
			out.append(msg);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
