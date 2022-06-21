package Operations;

public interface Sin {
    public static double sin(int x) {
        double degrees = x;
        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians); // sin() method from Math class
        return sinValue;
    }
}
