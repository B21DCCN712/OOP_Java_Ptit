import java.util.*;
public class J03032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            for( String i:a){
                System.out.print(new StringBuilder(i).reverse().toString() +" ");
            }
            System.out.println();
        }
    }
}
