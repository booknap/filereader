package stopwatch;

public class Main {

	public static void main(String[] args) {
		TaskTimer t = new TaskTimer();
		ReadFileToStringTask task1 = new ReadFileToStringTask();
		ReadfileToStringBuilderTask task2 = new ReadfileToStringBuilderTask();
		ReadFileToBufferedReaderTask task3 = new ReadFileToBufferedReaderTask();
		t.measure(task1);
		t.measure(task2);
		t.measure(task3);
	}
	
}
