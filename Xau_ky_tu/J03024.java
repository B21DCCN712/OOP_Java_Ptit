import java.util.*;
public class J03024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s = sc.nextLine();
            if( check(s)==1 ){
                System.out.println("YES");
            }
            else if ( check(s)==2){
                System.out.println("NO");
            }
            else System.out.println("INVALID");
        }
    }
    static int check(String s){
        int n = s.length();
        if( s.charAt(0)=='0') return 0;
        int chan=0,le=0;
        for( int i=0 ; i<n ; i++){
            if ( s.charAt(i) < '0' || s.charAt(i) >'9'){
                return 0;
            }
            int x = s.charAt(i)-'0';
            if( x%2 ==0){
                chan += 1;
            }
            else le+=1;
        }
        if( n % 2 ==0 && chan > le) return 1;
        else if( n % 2 == 1 && le > chan) return 1;
        return 2;
    }
}
