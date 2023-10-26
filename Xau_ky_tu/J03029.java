import java.util.*;

public class J03029 {
    static String chuanhoa(String s){
        String[] a=s.trim().toLowerCase().split("\\s+");
        
        String res="";
        res=res +a[0].substring(0,1).toUpperCase()+ a[0].substring(1)+" ";
        for(int i=1 ; i<a.length ; i++){
            if( a[i].equals(".") || a[i].equals("?") || a[i].equals("!") ) res=res.substring(0,res.length()-1);
            res = res + a[i];
            if (i!= a.length-1) res +=" ";
        }
        char c=res.charAt(res.length()-1);
        if( c>='a' && c<='z') res +='.';
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res="";
        while (sc.hasNext()){
            String a=sc.nextLine();
           // if (a.equals("-1")) break;
            res = res + a +"\n";
        }
        String[] s = res.split("\n");
        for(int i=0 ; i<s.length ; i++) System.out.println(chuanhoa(s[i]));
    }
}
