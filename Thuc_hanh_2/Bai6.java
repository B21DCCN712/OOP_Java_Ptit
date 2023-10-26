import java.util.*;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> m = new LinkedHashMap<>();
        while(sc.hasNextInt()){
            int x=sc.nextInt();
            //if(x==-1) break;
            if(m.get(x)==null) m.put(x,1);
            else m.put(x,m.get(x)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(m.entrySet());
        Collections.sort(list,(a,b) -> {
            int check= b.getValue().compareTo(a.getValue());
            return check;
        });

        for(Map.Entry<Integer,Integer> i : list){
            if(check(i.getKey())) System.out.println(i.getKey()+" "+i.getValue());
        }
    }
    static boolean check(int n){
        String s = String.valueOf(n);
        if (s.length()==1){
            return false;
        }
        for( int i=1 ; i<s.length() ; i++){
            if( s.charAt(i)-'0' < s.charAt(i-1)-'0') return false;
        }
        return true;
    }
}
