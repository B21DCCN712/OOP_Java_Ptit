import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
public class J03020 {
    static boolean thuan_nghich(String s) {
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new HashMap<>();
        int res = 1;
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            //if(s.equals("TDTD")) break;
            if (thuan_nghich(s)) {
                list.add(s);
                res = Math.max(res, s.length());
                if (m.get(s) != null) {
                    m.put(s, m.get(s) + 1);
                } else {
                    m.put(s, 1);
                }
            }
        }
        ArrayList<String> s = new ArrayList<>();
        for (String i : list) {
            if (i.length() == res && ! s.contains(i)) {
                System.out.println(i + " " + m.get(i));
                s.add(i);
            }
        }
    }
}