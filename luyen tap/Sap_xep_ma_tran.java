import java.io.File;
import java.io.IOException;
import java.util.*;
public class Sap_xep_ma_tran {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            int[] b = new int[n+1];
            int[][] a = new int[n+1][m+1];
            for( int i=1 ; i<=n ; i++){
                for( int j=1 ; j<=m ; j++){
                    a[i][j]=sc.nextInt();
                    if(j==k){
                        b[i]=a[i][k];
                    }
                }
            }
            Arrays.sort(b,1,n+1);
            for( int i=1 ; i<=n ; i++){
                for( int j=1 ; j<=m ; j++){
                    if( j==k) System.out.print(b[i]+" ");
                    else System.out.print(a[i][j]+" ");
                    //System.out.println(a[i][j]);
                }
                System.out.println();
            }
        }
    }
}
