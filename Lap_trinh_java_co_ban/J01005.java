import java.util.*;
public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double n=sc.nextInt();
            double h=sc.nextInt();
            for(int i=1 ; i<=n-1 ; i++){
                double x = h * Math.sqrt(i/n);
                //System.out.println(x);
                System.out.print(String.format("%.6f", x) + " ");
            }
            System.out.println();
        }
    }
}

