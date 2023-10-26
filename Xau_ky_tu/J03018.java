import java.util.*;
public class J03018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s =sc.nextLine();
            if(s.length() > 2) s=s.substring(s.length()-2);
            if (Integer.parseInt(s) % 4 == 0) System.out.println(4);
            else System.out.println(0);
        }
    }
}
