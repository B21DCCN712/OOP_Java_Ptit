import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class So_khong_giam {
   
    static boolean check(int n){
        String s = String.valueOf(n);
        if (s.length()==1){
            return false;
        }
        for( int i=1 ; i<s.length() ; i++){
            if( s.charAt(i)-'0' < s.charAt(i-1)-'0') return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        int[] a=new int[10005];
        int[] b = new int[10005];
        for(Integer i : list1){
            a[i]++;
        }
        for(Integer i : list2){
            b[i]++;
        }
        for(int i=0 ; i<=10000;i++){
            if (a[i]>0 && b[i]>0 && check(i)){
                System.out.println(i + " "+ a[i] + " "+b[i]);
            }
        }
        in1.close();
        in2.close();
    }
}
