import java.util.Scanner;
public class J01017 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while ( t-- > 0){
            String s = sc.next();
            int check=1;
            char a[] = s.toCharArray();
            for( int i=0 ; i<s.length()-1; i++){
                if( Math.abs( (a[i]-'0') - (a[i+1]-'0') ) != 1 ){
                    check=-1;
                    break;
                }
            }
            if( check==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
