
import java.util.*;
public class J03023 {
    static int giatri(char c){
        if( c=='I') return 1;
        else if(c=='V') return 5;
        else if(c=='X') return 10;
        else if (c=='C') return 100;
        else if(c=='L') return 50;
        else if (c=='D') return 500;
        else return 1000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            int n=s.length();
            int[] a = new int[n];
            a[0]=giatri(s.charAt(0));
            for(int i=1 ; i<s.length();i++){
                a[i]=giatri(s.charAt(i));
                if (a[i]>a[i-1]) a[i-1] *=-1;
            }
            int res=0;
            for(int i=0 ; i<n ; i++) res += a[i];
            System.out.println(res);
        }
    }
}
