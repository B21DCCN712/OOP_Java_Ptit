import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class J07029 {
    static int isprime(int n){
        if (n < 2) return 0;
        for( int i=2 ; i<= Math.sqrt(n) ; i++){
            if( n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>)in.readObject();
        int[] a = new int[1000005];
        int max=-1;
        for( Integer i : ds){
            max=Math.max(max,i);
            a[i]++;
        }
        int dem=0;
        for( int i=max ; i>=0 ; i--){
            if( a[i] > 0 && isprime(i)==1){
                dem += 1;
                System.out.println(i+" "+a[i]);
            }
            if( dem==10){
                break;
            }
        }
    }
}
