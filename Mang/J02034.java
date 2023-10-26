import java.util.*;
public class J02034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for( int i=0 ; i<n ; i++){
            a[i]=sc.nextInt();
        }
        if( a[n-1]==n){
            System.out.println("Excellent!");
        }
        else{
            int x = a[n-1]+5;
            boolean[] f = new boolean[x];
            for( int i:a){
                f[i]=true;
            }
            for( int i=1 ; i<=a[n-1];i++){
                if( !f[i]){
                    System.out.println(i);
                }
            }
        }
    }
}
