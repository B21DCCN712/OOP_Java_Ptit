package J04008;

public class Triangle {
    private Point A = new Point() , B = new Point() , C = new Point();
    private double AB,BC,CA;
    public Triangle(double x1, double y1 , double x2, double y2, double x3, double y3){
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        this.AB = A.distance(B);
        this.BC = B.distance(C);
        this.CA = C.distance(A);
    }
    public String toString(){
        if (AB + CA <= BC || AB + BC <= CA || CA + BC <= AB){
            return String.format("INVALID");
        }
        else{
            return String.format("%.3f", AB + BC + CA);
        }
    }
}
