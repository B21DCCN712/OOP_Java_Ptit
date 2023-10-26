import java.util.Scanner;

public class J03008 {
    static int prime( int n){
        if( n<2) return 0;
        for( int i=2 ; i<=Math.sqrt(n) ; i++){
            if( n % i == 0) return 0;
        }
        return 1;
    }
    static String check( String s){
        char[] a = s.toCharArray();
        int l  = s.length();
        for( int i=0 ; i<l/2 ; i++){
            if( a[i] != a[l-1-i] || prime((i-'0'))==0) return "NO";
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
