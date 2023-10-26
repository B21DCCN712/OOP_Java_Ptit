import java.util.*;
public class J02007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for( int j=0 ; j<t ; j++){
            int n=sc.nextInt();
            int[] a = new int[n];
            int[] f = new int[100005];
            for( int i=0 ; i<n ; i++){
                a[i]=sc.nextInt();
                f[a[i]]++ ;
            }
            System.out.println("Test "+(j+1) +":");
            
            for( int i : a){
                if ( f[i] > 0){
                    System.out.println(i + " xuat hien "+ f[i] + " lan");
                    f[i]=0;
                }
            }

        }
    }
}
