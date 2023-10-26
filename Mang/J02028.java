import java.util.*;
public class J02028 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long[] a = new long[n];
            int check=-1;
            for( int i=0 ; i<n ; i++){
               a[i] = sc.nextLong();
            }
            int start =0;
            long sum=0;
            for( int i=0 ; i<n ; i++){
                sum += a[i];
                while(sum >k && start != i){
                    sum -= a[start];
                    start++;
                }
                if( sum ==k){
                    check=1;
                    break;
                }
            }
            if( check==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
