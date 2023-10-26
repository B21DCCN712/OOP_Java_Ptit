import java.util.*;
import java.io.*;
class SinhVien{
    private String msv,name,lop,email,sdt;
    public SinhVien(String msv , String name , String lop , String email , String sdt){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt = "0"+sdt;
    }
    public String getMsv(){
        return msv;
    }
    public String getLop(){
        return lop;
    }
    public String toString(){
        return msv+" "+name+" "+lop+" "+email+" "+sdt;
    }
}
public class Danh_sach_lien_lac {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<SinhVien>list = new ArrayList<>();
        while(sc.hasNextLine()){
            SinhVien a = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(a);
        }
        list.sort(new Comparator<SinhVien>() {
            public int compare(SinhVien a , SinhVien b){
                int x=a.getLop().compareTo(b.getLop());
                if(x==0){
                    return a.getMsv().compareTo(b.getMsv());
                }
                else{
                    return x;
                }
            }
        });
        for(SinhVien i : list){
            System.out.println(i);
        }

    }
}
