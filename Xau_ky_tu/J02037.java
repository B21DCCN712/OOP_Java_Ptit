import java.util.*;
public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int demle=0,demchan=0;
            String s=sc.nextLine();
            String[] x = s.split("\\s+");
            for(int i=0 ; i<x.length ; i++){
                if(Integer.parseInt(x[i]) %2 ==0) demchan++;
                else demle++;
            }
            if ( (x.length % 2==0 && demchan >demle) || (x.length % 2 == 1) && demchan < demle){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
