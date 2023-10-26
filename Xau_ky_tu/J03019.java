import java.util.*;
public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next(),x="";
        char k='a';
        for( int i=s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i) >=k){
                x = s.charAt(i)+x;
                k=s.charAt(i);
            }
        }
        System.out.println(x);
    }
}
