import java.io.*;
import java.util.ArrayList;
public class Doc_file_nhi_phan_1 {
    static boolean is_prime(int n){
        if( n<2) return false;
        for( int i=2 ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> list =(ArrayList<Integer>) in.readObject();
        int[] f = new int[1000005];
        for(Integer i : list){
            f[i]++;
        }
        for(int i=100 ; i<=1000000 ; i++){
            if(f[i]>=1 && is_prime(i)){
                System.out.println(i);
            }
        }
    }
}
