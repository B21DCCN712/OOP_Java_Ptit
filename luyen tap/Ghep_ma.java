import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class Ghep_ma {
   
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
        ArrayList<String> list1 = (ArrayList<String>) in1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        int[] a=new int[10005];
        int[] b = new int[10005];
        Set<String> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        for(String i : list1){
            s1.add(i);
        }
        for(Integer i : list2){
            s2.add(i);
        }
        for(int i=0 ; i<=10000;i++){
            if (a[i]>0 && b[i]>0){
                System.out.println(i+" "+a[i]+" "+b[i]);
            }
        }
        for(String i:s1){
            for(Integer j : s2){
                System.out.println(i+j);
            }
        }
        in1.close();
        in2.close();
    }
}
