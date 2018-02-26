package stopwatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * This class use to read file by using FileInputstream.
 * @author Napasai Sutthichutipong
 *
 */
public class ReadFileToStringTask implements Runnable {

	public String readFileToString(String filename) {
		String data = "";
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while (true) {
				c = reader.read();
				if (c < 0)
					break;
				data = data + (char) c;
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try {
			if (in != null)
				in.close();
		} catch (IOException ioe) {

		}
		return data.toString();
	}

	/** Description of the task. */
	public String toString() {
		return String.format("Reading Alice.txt using FileReader, append to String.\nRead %d ",
				readFileToString("src/Alice.txt").length());
	}

	/** Run the class */
	@Override
	public void run() {
		readFileToString("src/Alice.txt");
	}

}
