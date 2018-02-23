package stopwatch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFileToBufferedReaderTask implements Runnable{

	public String readFileToBufferedReader(String filename) {
		String data = "";
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String c;
			while (true) {
				c = reader.readLine();
				if (c == null)
					break;
				data = data + c + "\n";
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
	
	public String toString(){
		return String.format("Reading Alice.txt using BufferedReader, append lines to String.\nRead %d ",
				readFileToBufferedReader("src/Alice.txt").length());
	}
	
	@Override
	public void run() {
		readFileToBufferedReader("src/Alice.txt");
	}

}
