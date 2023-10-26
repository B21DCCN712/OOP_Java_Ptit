package J05007;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Nhan_vien implements Comparable<Nhan_vien> {
    static int res=1;
    private String id,name,sex,date,address,tax,day;
    public Nhan_vien(String name, String sex, String date,String address, String tax,String day){
        this.name =name;
        this.sex =sex;
        this.date =date;
        this.address =address;
        this.tax=tax;
        this.day=day;
        this.id=String.format("%05d", res++);
    }
    public String toString(){
        return id+" "+name+" "+sex+" "+date+" "+address+" "+tax+" "+day;
    }
    public int compareTo(Nhan_vien x){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = sdf.parse(this.date);
            Date date2= sdf.parse(x.date);
            return date1.compareTo(date2);
        } catch (ParseException e) {
            return -1;
        }
    }
}
