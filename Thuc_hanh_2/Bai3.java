import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            String[] a = s.split("\\s+");
            for(int i=a.length-1 ; i>=0 ; i--){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
