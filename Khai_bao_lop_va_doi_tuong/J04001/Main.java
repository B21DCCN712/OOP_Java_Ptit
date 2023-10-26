package J04001;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0){
            double x1=sc.nextDouble();
            double x2=sc.nextDouble();
            double y1=sc.nextDouble();
            double y2=sc.nextDouble();
            Point a = new Point(x1,x2);
            Point b = new Point(y1,y2);
            Point c = new Point();
            c.setDist(a.distance(b));
            System.out.println(c);
        }
    }
}
