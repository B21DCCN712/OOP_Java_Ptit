import java.util.Scanner;

public class J01006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            long fibo = fibonaci(n);
            System.out.println(fibo);
            t--;
        }
    }
    static long fibonaci(int n){
        if( n<=2) return 1;
        long[] f = new long[n+1];
        f[1]=f[2]=1;
        for( int i=3 ; i<=n ; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

}
