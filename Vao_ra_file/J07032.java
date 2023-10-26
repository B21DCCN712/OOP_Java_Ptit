import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
public class J07032 {
   
    static boolean check(String s){
        if( s.length() % 2 == 0 || s.length()==1) return false;
        for( int i=0  ;i<=s.length()/2 ; i++){
            if( s.charAt(i) != s.charAt(s.length()-1-i)) return false;
            if((s.charAt(i)-'0') % 2 ==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException , ClassNotFoundException{
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        int[] a=new int[1000000];
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        for(Integer i : list1){
            a[i]++;
            s1.add(i);
        }
        for(Integer i : list2){
            a[i]++;
            s2.add(i);
        }
        int s=0;
        for(Integer i : s1){
            if (s2.contains(i) && check(i.toString()) ){
                System.out.println(i+" "+a[i]);
                s += 1;
            }
            if( s==10) break;
        }
        in1.close();
        in2.close();
    }
}
