package ex65;

public class Cicle implements GeometricObject {
    protected double radius;
    public Cicle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getperimeter() {
        return Math.PI*radius*2;
    }
    public String toString() {
        return "ResizableCircle[Circle "+radius+"]";
    }
}

