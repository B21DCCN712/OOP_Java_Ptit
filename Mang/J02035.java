import java.util.*;
public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a = new int[n];
            int res=-1;
            for( int i=0 ;  i<n ; i++){
                a[i]=sc.nextInt();
                if(a[i]==1) res=i;
            }
            System.out.println(res);
        }
    }
}
