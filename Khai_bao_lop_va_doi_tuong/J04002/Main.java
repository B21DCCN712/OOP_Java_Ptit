package J04002;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String color = sc.next();
        color = color.toLowerCase();
        color = String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);
        Rectange r = new Rectange(a, b, color);
        if ( r.getHeight() <= 0 || r.getWidth() <= 0){
            System.out.println("INVALID");
        }
        else{
            System.out.printf("%.0f %.0f %s" ,r.findPerimeter() ,r.findArea() , r.getColor());
        }
    }
}
