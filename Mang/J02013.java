import java.util.*;
public class J02013 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for( int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        for( int i=0 ; i<n ; i++){
            int check=-1;
            for( int j=0 ; j<n-i-1 ; j++){
                if( a[j] > a[j+1]){
                    int x=a[j];
                    a[j]=a[j+1];
                    a[j+1]=x;
                    check=1;
                }
            }
            if( check==-1) break;
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
