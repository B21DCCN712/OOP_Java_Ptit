import java.util.*;
public class J02023 {
    static String nhonhat(int n, int s){
        s -= 1;
        int[] a = new int[n];
        int i=n-1;
        while(s>0){
            if (s>9){
                a[i]=9;
                s-=9;
            }
            else{
                a[i]=s;
                s=0;
            }
            i -= 1;
        }
        a[0] += 1;
        String res="";
        for( int j=0 ; j<n ; j++){
            res += String.valueOf(a[j]);
        }
        return res;
    }
    static String lonnhat(int n, int s){
        String res="";
        while(s>0){
            if (s>9){
                res+="9";
                s-=9;
            }
            else{
                res += String.valueOf(s);
                s=0;
            }
        }
        while(res.length()<n){
            res += "0";
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        if (9*n<s || s==0){
            System.out.println("-1 -1");
        }
        else{
            System.out.println(nhonhat(n, s) +" " + lonnhat(n, s));
        } 
        // int[] a = new int[10];
        // for( int i=0 ; i<10 ; i++){
        //     System.out.println(a[i]);
        // }
    }
}
