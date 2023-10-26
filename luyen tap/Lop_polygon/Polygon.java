package Lop_polygon;

import java.util.ArrayList;

public class Polygon {
    public ArrayList<Point> a = new ArrayList<>();
    public Polygon(Point[] p){
        for( int i=0 ; i<p.length ; i++){
            this.a.add(p[i]);
        }
            this.a.add(a.get(0));
    }
    public String getArea(){
            int sum=0;
            for( int i=0 ; i<a.size()-1 ; i++){
                sum += a.get(i).x * a.get(i+1).y - a.get(i).y * a.get(i+1).x;
            }
            double x = (double) Math.abs(sum)/2;
                return String.format("%.3f", x);
        }
}
