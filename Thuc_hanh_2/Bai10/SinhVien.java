package Bai10;

public class SinhVien implements Comparable<SinhVien> {
    private String msv,name,lop,email,sdt , giangvien="",doan;
    public SinhVien(String msv , String name , String lop , String email , String sdt){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt = "0"+sdt;
    }
    public void setGiangvien(String giangvien){
        this.giangvien = giangvien;
    }
    public String getGiangvien(){
        return giangvien;
    }
    public void getDoan(String doan){
        this.doan = doan;
    }
    public String getMsv(){
        return msv;
    }
    public int compareTo(SinhVien x){
        return this.msv.compareTo(x.msv);
    }
    public String toString(){
        return msv+" "+name+" "+giangvien+" "+doan+" "+sdt;
    }
}
