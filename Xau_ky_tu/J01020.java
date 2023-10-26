import java.util.*;
public class J01020 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if (n==0) System.out.println("Impossible");
            else{
                HashSet<Character> h = new HashSet<>();
                for(int i=1 ; i<=100 ; i++){
                    String s=String.valueOf(n*i);
                    for(int j=0 ; j<s.length() ; j++) h.add(s.charAt(j));
                    if(h.size()==10){
                        System.out.println(n*i);
                        break;
                    }
                }
            }
        }
    }
}
