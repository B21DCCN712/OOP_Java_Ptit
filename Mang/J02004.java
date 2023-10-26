import java.util.Scanner;
public class J02004 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for( int i=0 ; i<t ; i++){
            int n=sc.nextInt();
            int arr[] = new int[n];
            for( int j=0 ; j<n ; j++){
                arr[j]=sc.nextInt();
            }
            int check=1;
            for( int j=0 ; j<n/2 ; j++){
                if( arr[j] != arr[n-j-1]){
                    check=-1;
                    break;
                }
            }
            if( check==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
