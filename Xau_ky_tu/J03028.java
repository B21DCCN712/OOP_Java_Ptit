import java.util.*;
public class J03028 {
    static String mahoa(String s){
        int res=0;
        for(int i=0 ; i<s.length() ; i++){
            res += (int)s.charAt(i)-65;
        }
        String x="";
        for(int i=0 ; i<s.length() ; i++){
            x += (char)( ((int)s.charAt(i)-'A' + res ) % 26 +'A');
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){            
            String s=sc.nextLine();
            int l=s.length()/2;
            String a=s.substring(0,l);
            String b=s.substring(l);
            a=mahoa(a);
            b=mahoa(b);
            String res="";
            for(int i=0 ; i<l ; i++){
                int num1=a.charAt(i)-'A';
                int num2=b.charAt(i)-'A';
                int num3=(num1+num2)%26;
                res += (char)( num3 +'A');
            }
            System.out.println(res);
        }
    }
}
