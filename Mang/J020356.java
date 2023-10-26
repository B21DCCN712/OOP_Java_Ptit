import java.util.*;
public class J020356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        if (s>9*n || s==0){
            System.out.println("-1 -1");
        }
        else{
            int[] a = new int[n];
            int[] b = new int[n];
            a[0]=1;
            int x=s-1;
            for( int i=n-1 ; i>=0 ; i--){
                if(x>=9){
                    a[i]+=9;
                    x-=9;
                }
                else{
                    a[i] +=x;
                    x=0;
                    break;
                }
            }
            x=s;
            for( int i=0 ; i<n ; i++){
                if(x>=9){
                    b[i]+=9;
                    x-=9;
                }
                else{
                    b[i]+=x;
                    break;
                }
            }
            for( int i=0 ; i<n ; i++){
                System.out.print(a[i]);
            }
            System.out.print(" ");
            for( int i=0 ; i<n ; i++){
                System.out.print(b[i]);
            }
        }
    }
}
