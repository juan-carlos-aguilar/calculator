package Operations;

public interface Cos {
    public static double cos(int x) {
        double degrees = x;
        double radians = Math.toRadians(degrees);
        double cosValue = Math.cos(radians); // cos() method from Math class
        return cosValue;
    }
}
