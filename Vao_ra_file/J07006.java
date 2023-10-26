import java.io.*;
import java.util.ArrayList;

public class J07006{
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        int[] a = new int[1005];
        ArrayList<Integer> list = (ArrayList<Integer>)in.readObject();
        for(Integer i : list){
            a[i]++;
        }
        for( int i=0 ; i<=1000 ; i++){
            if( a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}