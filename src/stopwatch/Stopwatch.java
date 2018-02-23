package stopwatch;

public class Stopwatch {

	private long startTime = 0;
	private long stopTime = 0;
	private boolean running;
	public static final double NANOSECOND = 1.0E-9;

	public Stopwatch() {
		this.running = false;
	}

	public void start() {
		if (running)
			return;
		this.startTime = System.nanoTime();
		running = true;
	}

	public void stop() {
		if (!running)
			return;
		this.stopTime = System.nanoTime();
		running = false;
	}

	public boolean isRunning() {
		return running;
	}

	public double getElapsed() {
		if (running)
			return (System.nanoTime() - startTime) * NANOSECOND;
		else
			return (stopTime - startTime) * NANOSECOND;
	}

}
