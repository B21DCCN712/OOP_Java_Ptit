import java.util.*;
public class J02010 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for( int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        for( int i=0 ; i<n-1 ; i++){
            for( int j=i+1 ; j<n ; j++){
                if( a[j] < a[i]){
                    int x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
            System.out.print("Buoc "+ (i+1) +": ");
            print(a, n);
        }
    }
    static void print(int[] a , int n){
        for( int i=0 ; i<n ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
