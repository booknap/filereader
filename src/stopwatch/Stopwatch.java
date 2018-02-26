package stopwatch;

/**
 * Stopwatch class to time anything.
 * @author Napasai Sutthichutipong
 *
 */
public class Stopwatch {

	private long startTime = 0;
	private long stopTime = 0;
	private boolean running;
	public static final double NANOSECOND = 1.0E-9;

	/**
	 * Constructor to initialize boolean running.
	 */
	public Stopwatch() {
		this.running = false;
	}

	/**
	 * Start the stopwatch.
	 */
	public void start() {
		if (running)
			return;
		this.startTime = System.nanoTime();
		running = true;
	}

	/**
	 * Stop the stopwatch.
	 */
	public void stop() {
		if (!running)
			return;
		this.stopTime = System.nanoTime();
		running = false;
	}

	/**
	 * Get boolean running.
	 * @return boolean running
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Get the elapsed time.
	 * @return elapsed time
	 */
	public double getElapsed() {
		if (running)
			return (System.nanoTime() - startTime) * NANOSECOND;
		else
			return (stopTime - startTime) * NANOSECOND;
	}

}
