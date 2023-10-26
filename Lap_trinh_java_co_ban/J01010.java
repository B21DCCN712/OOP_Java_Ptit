import java.util.Scanner;

public class J01010 {

    static String solve(String s) {
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == '0' || a[i] == '8' || a[i] == '9') {
                a[i] = '0';
            } else if (a[i] == '1') {
                a[i] = '1';
            } else {
                return "INVALID";
            }
        }
        int idx = 0;
        while (idx < s.length() && a[idx] == '0') {
            idx++;
        }
        if (idx == s.length()) {
            return "INVALID";
        }
        return new String(a, idx, s.length() - idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Đọc dòng mới sau khi đọc số bộ test
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}
