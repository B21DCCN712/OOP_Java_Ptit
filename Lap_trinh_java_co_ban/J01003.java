import java.util.Scanner;
public class J01003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if( a==0){
            if( b==0 ) System.out.print("VSN");
            else System.out.print("VN");
        }
        else{
            double c=(double) -b/a;
            System.out.format( "%.2f",c);
        }
    }
}
