public class circle {
    private double radius;
    public circle() {
        radius = 1.0;
    }
    public circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
