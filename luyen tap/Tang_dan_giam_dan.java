
import java.util.*;
public class Tang_dan_giam_dan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[] f = new int[1005];
            int n=sc.nextInt();
            int[] a = new int[n];
            for( int i=0 ; i<n ; i++){
                a[i] = sc.nextInt();
                f[a[i]]++;
            }
            for( int i=0 ; i<=1000 ; i+=2){
                if( f[i]>=1){
                        System.out.print(i+" ");
                    }
            }
            System.out.println();
            for( int i=999 ; i>=1 ; i-=2){
                if( f[i]>=1){
                        System.out.print(i+" ");
                    }
            }
            System.out.println();
        }
    }
}
