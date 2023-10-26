import java.util.*;

public class J02024 {
    static List<String> results = new ArrayList<>();

    static void Try(int n, List<Integer> list, String s, int sum, int start) {
        if (start == n) {
            if (s.length() > 0 && sum % 2 == 1) {
                results.add(s.trim());
            }
            return;
        }
        Try(n, list, s, sum, start + 1);
        Try(n, list, s + String.valueOf(list.get(start)) + " ", sum + list.get(start), start + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list, Collections.reverseOrder());
            results.clear();
            Try(n, list, "", 0, 0);
            //Collections.sort(results);
            for (String i : results) {
                System.out.println(i);
            }
        }
    }
}
