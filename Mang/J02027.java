import java.util.*;
public class J02027 {
    static int lower_bound(int[] a , int l , int r, int x){
        int ans=r+1;
        while(l<=r){
            int m=(l+r)/2;
            if (a[m]>=x){
                ans=m;
                r=m-1;
            }
            else{
                l = m+1;;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            long res = 0;
            for (int i = 0; i < n-1; i++){
                int x=a[i]+k;
                res += lower_bound(a, i+1, n-1, x)-i-1;
            }
            System.out.println(res);
        }
    }
}
