import java.util.*;
public class J01024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            String s = sc.next();
            boolean check=true;
            for ( int i=0 ; i< s.length() ; i++){
                if ( s.charAt(i) > '2'){
                    check=false;
                    break;
                }
            }
            if( check == true){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
