import java.util.*;
public class J03025 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            int dem=0;
            int n=s.length();
            for( int i=0 ; i<n/2 ; i++){
                if( s.charAt(i) != s.charAt(n-i-1)){
                    dem += 1;
                }
            }
            if ( dem > 1){
                System.out.println("NO");
            }
            else{
                if( n % 2 == 0 && dem ==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
            
        }
    }
}
