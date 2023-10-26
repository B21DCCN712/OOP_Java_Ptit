import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class bAI_TOAN_SS {
    static int id = 0;
    static HashMap<String, Integer> um = new HashMap<>();
    static List<Integer>[] adj;
    static int[] color;

    public static int convert(String a) {
        if (!um.containsKey(a)) {
            id++;
            um.put(a, id);
        }
        return um.get(a);
    }

    public static boolean DFS_cycle(int u) {
        color[u] = 1;
        for (int x : adj[u]) {
            if (color[x] == 0) {
                if (DFS_cycle(x)) return true;
            } else if (color[x] == 1) return true;
        }
        color[u] = 2;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            adj = new ArrayList[1007];
            for (int j = 0; j < 1007; j++) {
                adj[j] = new ArrayList<>();
            }
            color = new int[1007];

            int ok = 1;
            for (int j = 0; j < n; j++) {
                String a = scanner.next();
                String b = scanner.next();
                String c = scanner.next();
                int x = convert(a);
                int y = convert(c);
                if (b.equals(">")) {
                    adj[x].add(y);
                } else {
                    adj[y].add(x);
                }
            }
            for (int j = 1; j <= id; j++) {
                if (color[j] == 0) {
                    if (DFS_cycle(j)) {
                        ok = 0;
                        System.out.println("impossible");
                        break;
                    }
                }
            }
            if (ok == 1) {
                System.out.println("possible");
            }
        }
    }
}
