// instantiate an object of this class type when you need to pause your code
public class Stopwatch {
    private long startTime;

    // Sets the current time
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Returns elapsed time in seconds
    // Returns how much time has elapsed since the startTime
    private double getElapsedSeconds() {
        long currentTime = System.currentTimeMillis();
        return (currentTime - startTime) / 1000.0;
    }

    // Returns a boolean indicating if the number of seconds passed in has passed
    // since startTime
    public boolean hasTimePassed(double seconds) {
        return getElapsedSeconds() >= seconds;
    }
}