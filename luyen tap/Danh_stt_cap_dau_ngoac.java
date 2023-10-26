import java.util.*;

public class Danh_stt_cap_dau_ngoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int k=1;
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            int n = s.length();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                    if (s.charAt(i) == '(') {
                        a[i]=k;k++;
                        st.push(i);
                    } else {
                        a[i] = a[st.pop()];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] != 0) {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
