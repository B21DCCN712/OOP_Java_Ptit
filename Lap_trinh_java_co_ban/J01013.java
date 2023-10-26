import java.util.Scanner;
public class J01013 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 0;
        while(t-- > 0){
            long n = sc.nextLong();
            for( int i=2 ; i<=Math.sqrt(n) ; i++){
                if( n % i ==0){
                    while( n % i ==0){
                        res += i;
                        n /= i;
                    }
                }
            }
            if( n > 1) {
                res += n;
            }
        }
        System.out.println(res);
    }
}
