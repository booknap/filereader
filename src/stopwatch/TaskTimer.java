package stopwatch;

/**
 * TaskTimer class to use stopwatch to time the tasks and print the result.
 * @author Napasai Sutthichutipong
 *
 */
public class TaskTimer {

	private static Stopwatch sw = new Stopwatch();
	
	/**
	 * Measure and print the elapsed time of tasks.
	 * @param task that want to measure
	 */
	public void measure(Runnable task){
		sw.start();
		task.run();
		sw.stop();
		System.out.print(task.toString());
		System.out.printf("in %.6f sec.\n",sw.getElapsed());
	}
	
}