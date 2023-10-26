import java.util.Scanner;
public class J01002{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for( int i=0 ; i<t ; i++){
            int n=sc.nextInt();
            long sum= (long)(n+1)*n/2;
            System.out.println(sum);
        }
        
    }
}