import java.util.*;
import java.io.*;

public class Tinh_tong_so_long {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("E:\\Ki_1_nam_3\\Lap_trinh_huong_doi_tuong\\luyen tap\\DATA.in"));
        long sum=0;
        while( in.hasNext()){
            try{
                long x = Long.parseLong(in.next());
                if(x>2147483647)sum += x;
            }
            catch(Exception x){};
        }
        System.out.println(sum);
    }
}
