import java.util.*;
public class J01022 {
    static int kiemtra(int n, long k, long dp[]){
        if (n==1) return 0;
        else if (n==2) return 1;
        if ( k <= dp[n-2]){
            return kiemtra(n-2,k,dp);
        }
        else return kiemtra(n-1,k-dp[n-2],dp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] dp = new long[95];
        dp[1]=dp[2]=1;
        for( int i=3 ; i<=92 ; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        while (t-->0){
            int n =sc.nextInt();
            long k =sc.nextLong();
            System.out.println(kiemtra(n, k, dp));
        }
    }
}
