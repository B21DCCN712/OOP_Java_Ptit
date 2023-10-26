import java.util.*;
public class J02011 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for( int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        for( int i=0 ; i<n-1 ; i++){
            System.out.print("Buoc "+ (i+1) +": ");
            int res=a[i],ans=i;
            for( int j=i+1 ; j<n ; j++){
                if( a[j] < res){
                    res=a[j];
                    ans=j;
                }
            }
            if( ans != i){
                int x=a[i];
                a[i]=a[ans];
                a[ans]=x;
            }
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
