import java.util.*;
public class J02014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a= new int[n];
            int[] sum = new int[n];
            int res=0;
            for( int i=0 ; i<n ; i++){
                a[i]=sc.nextInt();
                res += a[i];
                sum[i] = res;
            }
            int idx=-1;
            int check=-1;
            for( int i=1 ; i<n-1 ; i++){
                if( sum[i]-a[i] == sum[n-1]-sum[i]){
                    check=1;
                    idx=i;
                    break;
                }
            }
            if( check==-1){
                System.out.println(-1);
            }else{
                System.out.println(idx+1);
            }
        }
    }
}
