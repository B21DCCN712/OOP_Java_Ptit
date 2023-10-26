import java.io.File;
import java.io.IOException;
import java.util.*;

public class Bai5 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> set = new TreeSet<>();
        while (sc.hasNext()){
            String s=sc.next();
            if(check(s)) set.add(s);
        }
        for(String i : set){
            System.out.println(i);
        }
    }
    private static boolean check(String s) {
        int check=0;
        for(int i=0 ; i<s.length() ; i++){
            if( s.charAt(i)>='0' && s.charAt(i)<='9') check=1;
            if(s.charAt(i)=='.' || s.charAt(i)==',' ||s.charAt(i)=='!' ||s.charAt(i)=='?' ||s.charAt(i)==':' ) return false;
        }
        if (check ==1) return true;
        return false;
    }
}
