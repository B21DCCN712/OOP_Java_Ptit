import java.util.Scanner;

public class J03006 {
    static String check( String s){
        char[] a = s.toCharArray();
        int l  = s.length();
        for( int i=0 ; i<l/2 ; i++){
            if( a[i] != a[l-1-i] || (a[i]-'0') % 2 == 1) return "NO";
        }
        
        return "YES";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}
