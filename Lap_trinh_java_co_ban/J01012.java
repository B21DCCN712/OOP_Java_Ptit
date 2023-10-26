import java.util.Scanner;
public class J01012 {
    static int check( int n){
        return n % 2 ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            int n=sc.nextInt();
            int res=0;
            for( int i=1 ; i<=Math.sqrt(n) ; i++){
                if( n % i ==0 ){
                    if( check(i)==0) res++;
                    int ans = n/i;
                    if( check(n/i) == 0 ) res++;
                    if( i*i == n && check(i)==0) res--;
                }
            }
            System.out.println(res);
        }
    }
}
