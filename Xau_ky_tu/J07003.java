import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class J07003 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s=sc.next();
        while(s.length()>1){
            int l=s.length();
            BigInteger a = new BigInteger(s.substring(0,l/2));
            BigInteger b = new BigInteger(s.substring(l/2));
            System.out.println(a.add(b));
            s= a.add(b).toString();
        }
    }
}
