import java.util.*;
public class Tinh_tong_cac_chu_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            char[] a = s.toCharArray();
            int res=0;
            for( int i=0 ; i<a.length ; i++){
                if( a[i] >='0' && a[i] <='9'){
                    res += (a[i]-'0');
                }
            }
            Arrays.sort(a);
            for( int i=0 ; i<a.length ; i++){
                if(a[i]>='A' && a[i] <='Z') System.out.print(a[i]);
            }
            System.out.println(res);
        }
    }
}
