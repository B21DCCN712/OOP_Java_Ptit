import java.util.Scanner;

public class J03007 {
    static String check( String s){
        char[] a = s.toCharArray();
        int l  = s.length();
        if ( a[0] != '8') return "NO";
        int res=0;
        for( int i=0 ; i<l/2 ; i++){
            if( a[i] != a[l-1-i] ) return "NO";
            res += 2 * (a[i]-'0');
        }
        if( l % 2 == 1) res -= (a[l/2]-'0');
        if( res % 10 != 0) return "NO";
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
