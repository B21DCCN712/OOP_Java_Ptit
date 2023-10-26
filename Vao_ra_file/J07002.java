import java.util.*;
import java.io.*;

public class J07002 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("DATA.in"));
        long sum=0;
        while( in.hasNext()){
            try{
                int x = Integer.parseInt(in.next());
                sum += x;
            }
            catch(Exception x){};
        }
        System.out.println(sum);
    }
}
