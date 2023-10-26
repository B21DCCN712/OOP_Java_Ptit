
import java.util.*;
public class Bai15 {
    static int id = 0;
    static HashMap<String, Integer> h = new HashMap<>();
    static int[] ok;
    static List<Integer>[] list ;
    public static int danhdau(String a) {
        if (!h.containsKey(a)) {
            id++;
            h.put(a, id);
        }
        return h.get(a);
    }

    public static boolean DFS(int u) {
        ok[u] = 1;
        for (int x : list[u]) {
            if (ok[x] == 0) {
                if (DFS(x)) return true;
            } else if (ok[x] == 1) return true;
        }
        ok[u] = 2;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        list = new ArrayList[1007];
            for (int j = 0; j < 1007; j++) {
                list[j] = new ArrayList<>();
            }
            ok = new int[1007];

            int check = 1;
            for (int j = 0; j < n; j++) {
                String a = sc.next();
                String b = sc.next();
                String c = sc.next();
                int x = danhdau(a);
                int y = danhdau(c);
                if (b.equals(">")) {
                    list[x].add(y);
                } else {
                    list[y].add(x);
                }
            }
            for (int j = 1; j <= id; j++) {
                if ( ok[j] == 0) {
                    if (DFS(j)) {
                        check = 0;
                        System.out.println("impossible");
                        break;
                    }
                }
            }
            if (check == 1) {
                System.out.println("possible");
            }
        }
}
