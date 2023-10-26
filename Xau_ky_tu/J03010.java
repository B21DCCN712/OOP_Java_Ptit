import java.util.*;
import java.util.HashMap;
public class J03010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        Map<String,Integer> m = new HashMap<String,Integer>();
        while(t-->0){
            String s = sc.nextLine().trim().toLowerCase();
            String x="";
            String[] s1 = s.split("\\s+");
            String email=s1[s1.length-1];
            for( int i=0 ; i<s1.length-1 ; i++){
                email += s1[i].charAt(0);
            }
            if ( m.get(email)==null){
                m.put(email,1);
                x="";
            }
            else{
                x = Integer.toString(m.get(email)+1);
                m.put(email,m.get(email)+1);
            }
            System.out.println(email + x + "@ptit.edu.vn");
        }
    }
}
