import java.io.*;
import java.util.ArrayList;
public class J07015 {
    static int isprime(int n){
        if (n < 2) return 0;
        for( int i=2 ; i<= Math.sqrt(n) ; i++){
            if( n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in  = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>)in.readObject();
        int[] a = new int[10000];
        for( Integer i : ds){
            a[i]++;
        }
        for( int i=0 ; i<10000 ; i++){
            if( a[i] >0 && isprime(i) == 1){
                System.out.println(i+" " + a[i]);
            }
        }
    }
}
