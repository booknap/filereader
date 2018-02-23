package stopwatch;

public class TaskTimer {

	private static Stopwatch sw = new Stopwatch();
	
	public void measure(Runnable task){
		sw.start();
		task.run();
		sw.stop();
		System.out.print(task.toString());
		System.out.printf("in %.6f sec.\n",sw.getElapsed());
	}
	
}