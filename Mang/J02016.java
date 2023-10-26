import java.util.*;
public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a = new long[n];
            long x;
            for( int i=0 ; i<n ; i++){
                x = sc.nextLong();
                a[i] = x*x;
            }
            Arrays.sort(a);
            boolean check=false;
            for( int i=a.length -1 ; i>=2 ; i--){
                int l=0,r=i-1;
                while(l<r){
                    if (a[l]+a[r]==a[i]){
                        check=true;
                        break;
                    }
                    else if (a[l]+a[r]<a[i]) l++;
                    else r--;
                }
                if (check==true){
                    break;
                }
            }
            if( check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
