import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class J07031 {
    static boolean prime(int n){
        if( n<2) return false;
        for( int i=2 ; i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        Set<Integer> s1 = new TreeSet<>(list1);
        Set<Integer> s2 = new TreeSet<>(list2);
        for(Integer i: s1){
            if ( s1.contains(1000000-i) && !s2.contains(1000000-i) && !s2.contains(i) && i < 1000000-i && prime(i) && prime(1000000-i)){
                System.out.println(i+" "+(1000000-i));
            }
        }
        in1.close();
        in2.close();
    }
}
