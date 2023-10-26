import java.util.*;
public class J01025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),x3=sc.nextInt(),y3=sc.nextInt(),x4=sc.nextInt(),y4=sc.nextInt();
        int minx1 = Math.min(x1,x3);
        int miny1 = Math.min(y1,y3);
        int maxx2 = Math.max(x2,x4);
        int maxy2 = Math.max(y2,y4);
        int min1 = Math.max(maxx2-minx1,maxy2-miny1);
        System.out.println(min1*min1);
    }
}
