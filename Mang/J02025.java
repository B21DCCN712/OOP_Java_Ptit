import java.util.*;
public class J02025 {
    static boolean prime(int n){
        if (n<2) return false;
        for( int i=2 ; i<=Math.sqrt(n) ; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    static List<String> results = new ArrayList<>();

    static void Try(int n, List<Integer> list, String s, int sum, int start) {
        if (start == n) {
            if (s.length() > 0 && prime(sum)) {
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
