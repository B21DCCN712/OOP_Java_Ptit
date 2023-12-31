import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class SP{
    public String maSP, ten;
    public int price, time;
    public SP(String ma, String ten, int price, int time){
        this.maSP = ma;
        this.ten = ten;
        this.price = price;
        this.time = time;
    }
}
class KH{
    public String maKH, ten, dc, maSP;
    public int number, tien;
    public LocalDate localDate;
    public KH(int i, String ten, String dc, String maSP, int number, String a){
        this.maKH = "KH" + String.format("%02d", i);
        this.ten = ten;
        this.dc = dc;
        this.maSP = maSP;
        this.number = number;
        this.localDate = LocalDate.parse(a, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public void settien(int price){
        this.tien = number * price;
    }
    public void setngay(int a){
        this.localDate = localDate.plus(a, ChronoUnit.MONTHS);
    }
    @Override
    public String toString(){
        Month month = localDate.getMonth();
        int days = localDate.getDayOfMonth();
        return maKH + " " + ten + " " + dc + " " + maSP + " " + tien + " " + String.format("%02d/", days) + String.format("%02d/", month.getValue()) + localDate.getYear();
    }
    public int getyear(){
        return localDate.getYear();
    }
    public int getmonth(){
        return localDate.getMonthValue();
    }
    public int getdays(){
        return localDate.getDayOfMonth();
    }
}
public class Tinh_ngay_het_han_bao_hanh {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        ArrayList<SP> a = new ArrayList<>();
        ArrayList<KH> b = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
            a.add(new SP(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
            b.add(new KH(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        for(SP x : a){
            for(KH y : b)
                if(x.maSP.equals(y.maSP)){
                    y.setngay(x.time);
                    y.settien(x.price);
                }
        }
        Collections.sort(b, Comparator.comparingInt(KH::getyear).thenComparing(KH::getmonth).thenComparing(KH::getdays));
        for(KH x : b)
            System.out.println(x);
    }
}