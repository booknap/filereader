package stopwatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * This class use to read file by using StringBuilder.
 * @author Napasai Sutthichutipong
 *
 */
public class ReadfileToStringBuilderTask implements Runnable {

	public String readfileToStringBuilder(String filename) {
		StringBuilder data = new StringBuilder();
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				data = data.append((char) c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			if (in != null)
				in.close();
		} catch (IOException ioe) {

		}
		return data.toString().replaceAll("\n", "");
	}

	/** Description of the task. */
	public String toString(){
		return String.format("Reading Alice.txt using FileReader, append to StringBuilder.\nRead %d ",
				readfileToStringBuilder("src/Alice.txt").length());
	}
	
	/** Run the class */
	@Override
	public void run() {
		readfileToStringBuilder("src/Alice.txt");
	}
	
}
