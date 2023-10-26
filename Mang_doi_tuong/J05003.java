
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien {
    public String msv, name, date, cl;
    public double gpa;

    public void inthongtin() {
        System.out.println(msv + " " + name + " " + cl + " " + date + " " + String.format("%.2f", gpa));
    }

    public SinhVien(int id, String name, String cl, String date, double gpa) {
        this.msv = "B20DCCN" + String.format("%03d",id);
        this.name = name;
        this.cl = cl;
        this.gpa = gpa;
        this.date = date;
    }
}

public class J05003 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for( int i=1 ; i<=t ; i++) {
            SinhVien s = new SinhVien(i , sc.nextLine(), sc.nextLine(), sdf.format(sdf.parse(sc.nextLine())), sc.nextDouble());
            s.inthongtin();
            sc.nextLine();
        }
        sc.close();
    }
}
