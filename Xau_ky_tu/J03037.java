import java.util.*;
public class J03037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        char[] s = a.toCharArray();
        Map<Integer,Integer> m = new LinkedHashMap<>();
        for(int i=0 ; i<s.length; i++){
            for(int j=i+1 ; j<s.length ; j++){
                if(s[i]==s[j]){
                    m.put(i,j);
                }
            }
        }
        int res=0;
        for(Map.Entry<Integer,Integer> i : m.entrySet()){
            for(Map.Entry<Integer,Integer> j : m.entrySet()){
                if (j.getKey() > i.getKey() && j.getKey() < i.getValue() && (j.getValue() > i.getValue() || j.getValue() < i.getKey()) ) res++;
            }
        }
        System.out.println(res);
    }
}
