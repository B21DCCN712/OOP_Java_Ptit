import java.util.Scanner;

public class J01011{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while( t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println( bcnn(a,b) +" "+ gcd(a,b));
        }
    }
        public static int gcd( int a, int b){
            if( b == 0 ) return a;
            return gcd(b,a%b);
        }

        public static long bcnn( int a, int b){
            return (long)a*b / gcd(a,b) ;
        }
}