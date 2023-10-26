package Bai11;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Khach {
    public String maKH, ten, address, maSP;
    public int number, tongtien;
    public LocalDate localDate;
    public Khach(int i, String ten, String address, String maSP, int number, String a){
        this.maKH = "KH" + String.format("%02d", i);
        this.ten = ten;
        this.address = address;
        this.maSP = maSP;
        this.number = number;
        this.localDate = LocalDate.parse(a, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public void settien(int giaban){
        this.tongtien = number * giaban;
    }
    public void setngay(int a){
        this.localDate = localDate.plus(a, ChronoUnit.MONTHS);
    }
    @Override
    public String toString(){
        Month month = localDate.getMonth();
        return maKH + " " + ten + " " + address + " " + maSP + " " + tongtien + " " + String.format("%02d/", localDate.getDayOfMonth()) + String.format("%02d/", month.getValue()) + localDate.getYear();
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
