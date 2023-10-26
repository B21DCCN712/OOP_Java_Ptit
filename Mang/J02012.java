import java.util.*;
public class J02012 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for( int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        for( int i=0 ; i<n ; i++){
            int res=a[i],ans=i-1;
            while( ans >= 0 && res < a[ans] ) ans --;
            for( int j=i ; j>=ans+2 ; j--){
                a[j]=a[j-1];
            }
            a[ans+1]=res;
            System.out.print("Buoc "+ i +": ");
            print(a, i);
        }
    }
    static void print(int[] a , int n){
        for( int i=0 ; i<=n ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
