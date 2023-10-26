import java.util.Scanner;
public class J01021 {
    static long mod = 1000000007;
    static long pow(long a, long b){
        if(b==0) return 1;
        long x = pow(a,b/2) ;
        x = (x*x) % mod;
        if (b%2==1) x *= a % mod;
        return x%mod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if( a==0 && b ==0 ){
                break;
            }
            System.out.println(pow(a,b));
        }
    }
}
