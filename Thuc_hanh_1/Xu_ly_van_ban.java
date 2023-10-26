import java.util.*;
import java.io.*;
public class Xu_ly_van_ban  {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("E:\\Ki_1_nam_3\\Lap_trinh_huong_doi_tuong\\luyen tap\\Vanban.in"));
        Set<String> s = new TreeSet<>();
        while(sc.hasNext()){
            String a=sc.next();
            if(check(a)) s.add(a);
        }
        for(String x:s){
            System.out.println(x);
        }
    }
    public static boolean check(String x){
        int l = x.length();
        int ok = 0;
        for ( int i = 0; i < l; i++ ){
            if ( x.charAt(i) >= '0' && x.charAt(i) <= '9' ) ok = 1;
            if ( x.charAt(i) == '.' || x.charAt(i) == ',' || x.charAt(i) == '!' || x.charAt(i) == '?' || x.charAt(i) == ':' )
                return false;
        }
        if ( ok == 1 ) return true;
        return false;
    }
}
