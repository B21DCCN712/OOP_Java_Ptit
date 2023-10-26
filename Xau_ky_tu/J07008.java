import java.util.*;
import java.io.*;
public class J07008 {
    static int n;
    static int[] a ;
    static ArrayList<Integer> b = new ArrayList<>();
    static ArrayList<String> list = new ArrayList<>();
    static void sinh(int i){
        if(b.size()>1){
            String s="";
            for(int j: b){
                s = s+j+" ";
            }
            list.add(s);
        }
        for(int j=i ; j<=n ; j++){
            if(b.isEmpty() || a[j] > b.get(b.size()-1)){
                b.add(a[j]);
                sinh(j+1);
                b.remove(b.size()-1);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n=sc.nextInt();
        a = new int[n+5];
        for(int i=1 ; i<=n ; i++){
            a[i]=sc.nextInt(); 
        }
        sinh(1);
        Collections.sort(list);
        for(String i:list){
            System.out.println(i);
        }
    }
}
