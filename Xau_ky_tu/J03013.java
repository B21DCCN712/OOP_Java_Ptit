import java.math.BigInteger;
import java.util.*;
public class J03013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
       // sc.nextLine();
        while ( t-- > 0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            String s = String.valueOf(a.subtract(b).abs());
            int x=Math.max(String.valueOf(a).length(), String.valueOf(b).length());
            while( s.length() < x){
                s = "0" + s;
            }
            System.out.println(s);
        }
    }
}
