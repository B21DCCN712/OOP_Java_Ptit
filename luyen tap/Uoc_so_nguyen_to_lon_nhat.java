import java.util.Scanner;

public class Uoc_so_nguyen_to_lon_nhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long res=-1;
            for( int i=2 ; i<=Math.sqrt(n) ; i++){
                if( n % i == 0){
                    if( res < i) res = i;
                }
                while( n % i ==0){
                    n = n/i;
                }
            }
        if( n> 1) res = Math.max(res,n);
            System.out.println(res);
        }
    }
}
