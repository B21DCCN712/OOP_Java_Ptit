import java.util.*;
public class Xau_nhi_phan_doi_xung_do_dai_chan {
    static Set<String> list = new TreeSet<>();
    public static void Try(String s,int n) {
        if(s.length()>n) return;
        if (s.length() == n && doixung(s)) {
            list.add(s);
            return;
        }
        for (char c : new char[]{'0', '1'}) {
            Try(s + c,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for(int i=2 ; i<=n ; i++){
                Try("",i);
                for(String x:list){
                    System.out.print(x+" ");
                }
                list.clear();
            }
            System.out.println();
        }   
    }
    public static boolean doixung(String s) {
        if(s.length() % 2 == 1 || s.length()==0 )return false;
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


// import java.io.File;
// import java.io.FileNotFoundException;
// import java.math.BigInteger;
// import java.util.*;

// public class Xau_Nhi_Phan_Doi_Xung_Do_Dai_Chan {

//     public static String rever(String x){
//         String re = "";
//         for ( int i = x.length() - 1; i >= 0; i -- ){
//             re += x.charAt(i);
//         }
//         return re;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt() / 2;
//             Queue<String> q = new LinkedList<>();
//             ArrayList<String> arr = new ArrayList<>();
//             q.add("0");
//             q.add("1");
//             while(!q.isEmpty()){
//                 String x = q.poll();
//                 arr.add(x);
//                 if ( x.length() < n ){
//                     q.add(x+"0");
//                     q.add(x+"1");
//                 }
//             }
//             for ( String x : arr ){
//                 System.out.print(x + rever(x) + " ");
//             }
//             System.out.println();
//         }
//     }
// }