import java.util.*;
public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="";
        while(sc.hasNext()){
            String x=sc.next().toLowerCase();
            //if (x.equals("@")) break;
            if(x.charAt(x.length()-1) == '.' || x.charAt(x.length()-1) == '?' || x.charAt(x.length()-1) == '!'){
                s=s+x.substring(0, x.length()-1) +"\n";
            }
            else s = s+x+" ";
        }
        String[] a = s.split("\n");
        for(String i : a){
            System.out.println(i.substring(0, 1).toUpperCase() + i.substring(1));
        }
    }
}
