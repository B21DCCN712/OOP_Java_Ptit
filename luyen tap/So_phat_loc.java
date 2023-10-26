import java.util.Scanner;

public class So_phat_loc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int l = s.length();
            if (l < 2) {
                System.out.println("NO");
            } else {
              
                if (s.charAt(l - 1) == '6' && s.charAt(l - 2) == '8') {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
