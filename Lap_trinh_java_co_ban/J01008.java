import java.util.Scanner;
public class J01008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for( int i=1 ; i<= t ; i++){
            int n= sc.nextInt();
            int res=2,dem=0;
            System.out.print("Test "+i+": ");
            while(n>1){
                if( n % res ==0){
                    while( n % res ==0){
                        dem += 1;
                        n /= res;
                    }
                    System.out.print(res +"(" + dem +") ");
                    dem=0;
                }
                res += 1;
            }
            System.out.println();
        }
    }
}
