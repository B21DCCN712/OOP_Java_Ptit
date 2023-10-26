import java.util.*;
public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Queue<String> q = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();
        q.add("2");
        q.add("3");
        q.add("5");
        q.add("7");
        while(!q.isEmpty()){
            String x = q.poll();
            if(check(x)) list.add(x);
            if(x.length()<n){
                q.add(x+"2");
                q.add(x+"3");
                q.add(x+"5");
                q.add(x+"7");
            }
        }
        for(String x : list) System.out.println(x);
    }

    private static boolean check(String x) {
        if(x.length()<4 || x.charAt(x.length()-1)=='2') return false;
        int dem2=0,dem3=0,dem5=0,dem7=0;
        for(int i=0 ; i<x.length() ; i++){
            if( x.charAt(i)=='2') dem2 += 1;
            else if( x.charAt(i)=='3') dem3 += 1;
            else if( x.charAt(i)=='5') dem5 += 1;
            else if( x.charAt(i)=='7') dem7 += 1;
            else return false;
        }
        if( dem2==0 || dem3==0 || dem5==0 || dem7==0) return false;
        return true;
    }
}
