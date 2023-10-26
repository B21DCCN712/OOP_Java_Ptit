import java.math.BigInteger;
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger s = new BigInteger(sc.next());
        while(s.toString().length()>1){
            String a=s.toString();
            int n=a.length();
            BigInteger x = new BigInteger(a.substring(0, n/2));
            BigInteger y = new BigInteger(a.substring(n/2));
            System.out.println(x.add(y));
            s = x.add(y);
        }
    }
}


