import java.util.*;
public class J03031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            int k=Integer.parseInt(sc.nextLine());
            Set<Character> ss = new HashSet<>();
            for(int i=0 ; i<s.length() ; i++){
                ss.add(s.charAt(i));
            }
            int check=-1;
            if(s.length() >=26 && ss.size() + k >=26) check=1;
            if(check==1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        //System.out.println((int)('a') - (int)('z'));
    }
}

