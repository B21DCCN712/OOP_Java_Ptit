import java.util.*;

public class J02026 {
    static List<String> results = new ArrayList<>();
    static int n,k;
    static void Try( List<Integer> list, String s, int sum, int start) {
        if (start == n) {
            if (s.split(" ").length == k) {
                results.add(s.trim());
            }
            return;
        }
        Try(list, s + String.valueOf(list.get(start)) + " ", sum + list.get(start), start + 1);
        Try(list, s, sum, start + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k=sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            results.clear();
            Try(list, "", 0, 0);
            for (String i : results) {
                System.out.println(i);
            }
        }
    }
}
