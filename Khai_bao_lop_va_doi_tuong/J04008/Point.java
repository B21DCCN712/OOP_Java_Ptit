package J04008;

public class Point {
    private double x,y;
    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point secondePoint){
        return Math.sqrt((this.x-secondePoint.x) * ( this.x - secondePoint.x)  +  (this.y -secondePoint.y) * ( this.y-secondePoint.y));
    }
}
