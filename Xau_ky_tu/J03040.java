import java.util.*;

public class J03040 {
    public static boolean check_tang(String s){
        for (int i=1 ; i<s.length() ; i++){
            if ( s.charAt(i) <=s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean check_balance1(String s){
        for( int i=1 ; i<s.length() ; i++){
            if ( s.charAt(i) != s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean check_balance2(String s){
        return check_balance1(s.substring(0, 2)) && check_balance1(s.substring(3));
    }

    public static boolean check_locphat(String s){
        for( int i=0 ; i<s.length() ; i++){
            if ( s.charAt(i) != '6' && s.charAt(i)!= '8'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while( t-- > 0){
            String s = sc.nextLine().trim().substring(5);
            s=s.substring(0,3) + s.substring(4);
            if( check_tang(s) || check_balance1(s) || check_balance2(s) || check_locphat(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
