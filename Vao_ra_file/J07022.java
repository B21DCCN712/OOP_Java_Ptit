import java.util.*;
import java.io.*;

public class J07022 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("DATA.in"));
        long sum=0;
        ArrayList<String> s = new ArrayList<>();
        while( in.hasNext()){
            String res = in.next();
            try{
                int x = Integer.parseInt(res);
            }
            catch(Exception x){
                s.add(res);
            }
        }
        s.sort(new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
            
        }
        );
        for( String i : s){
            System.out.print(i+" ");
        }
    }
}