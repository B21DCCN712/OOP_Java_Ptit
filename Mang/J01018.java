import java.util.Scanner;
public class J01018 {
    static String check( String s){
        char[] a = s.toCharArray();
        int res=a[0]-'0';
        for( int i=1 ; i<s.length() ; i++){
            if( Math.abs( (a[i]-'0') - (a[i-1]-'0') ) != 2) return "NO";
            res += a[i]-'0';
        }
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
