import java.util.*;

public class J02106{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int a[][] = new int[n][3];
        int sum[] = new int[n];
        for( int i=0 ; i<n ; i++){
            for( int j=0 ; j<3 ; j++){
                a[i][j] = sc.nextInt();
                sum[i] += a[i][j];
            }
        }
        for( int i=0 ; i<n ; i++){
            if (sum[i] >= 2){
                res +=1;
            }
        }
        System.out.println(res);
    }
}