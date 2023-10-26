import java.math.BigInteger;
import java.util.Scanner;

public class Nho_nhat_va_lon_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            BigInteger min = null;
            BigInteger max = null;
            boolean Equal = true;

            for (int i = 0; i < n; i++) {
                BigInteger s = sc.nextBigInteger();

                if (min == null || s.compareTo(min) < 0) {
                    min = s;
                }

                if (max == null || s.compareTo(max) > 0) {
                    max = s;
                }

                if (i > 0 && s.compareTo(sc.nextBigInteger()) != 0) {
                    Equal = false;
                }
            }

            if (Equal) {
                System.out.println("BANG NHAU");
            } else {
                System.out.println(min + " " + max);
            }
        }
    }
}
