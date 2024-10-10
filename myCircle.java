public class myCircle {
    private double radius;
    myCircle(){
        radius = 1.1;
    }
    public myCircle( double radius){
        this.radius = radius;
    }
    public void setRadius(){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "myCircle{" +
                "radius=" + radius +
                '}';
    }
}

