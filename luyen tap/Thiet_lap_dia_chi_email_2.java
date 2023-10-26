import java.util.*;
import java.io.*;
public class Thiet_lap_dia_chi_email_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E:\\Ki_1_nam_3\\Lap_trinh_huong_doi_tuong\\luyen tap\\DANHSACH.in"));
        ArrayList<String> list = new ArrayList<>();
        Set<String> ss = new LinkedHashSet<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim().toLowerCase();
            String[] s1 = s.split("\\s+");
            String x="";
            for(String i:s1){
                x += (i+" ");
            }
            ss.add(x);
        }
        for(String x:ss){
            String[] s1=x.split("\\s+");
            String email=s1[s1.length-1];
            for( int i=0 ; i<s1.length-1 ; i++){
                email += s1[i].charAt(0);
            }
            list.add(email);
            int dem=Collections.frequency(list, email);
            if( dem >1) email += dem;
            System.out.println(email+"@ptit.edu.vn");
        }
    }
}
