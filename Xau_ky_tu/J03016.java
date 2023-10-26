import java.math.BigInteger;
import java.util.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger("11");
            if (a.mod(b) .equals(BigInteger.ZERO))System.out.println(1);
            else System.out.println(0);
        }
    }
}
