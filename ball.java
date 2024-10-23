public class ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    public ball(float x, float y, int radius) {
        this.x =x;
        this.y = y;
        this.radius = radius;
        this.xDelta = x/radius;
        this.yDelta = y/radius;
    }
    public float getX(){
        return x;
    }
   public void setX(float x){
        this.x = x;
   }
   public float getY(){
        return y;
   }
   public void setY(float y){
        this.y = y;
   }
   public int getRadius(){
        return radius;
   }
   public void setRadius(int radius){
        this.radius = radius;
   }
   public float getXDelta(){
        return xDelta;
   }
   public void setXDelta(float xDelta){
        this.xDelta = xDelta;
   }
   public float getYDelta(){
        return yDelta;
   }
   public void setYDelta(float yDelta){
        this.yDelta = yDelta;
   }
   public void move(){
        x += xDelta;
        y += yDelta;
   }
   public void reflectHorizontal(){
        this.x += -xDelta;
   }
   public void reflectVertical(){
        this.y += -yDelta;
   }

    @Override
    public String toString() {
        return "ball{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", xDelta=" + xDelta +
                ", yDelta=" + yDelta +
                '}';
    }
}
