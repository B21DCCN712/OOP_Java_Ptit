package J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {
    private String msv,name,date,cl;
    private double gpa;
    public Student(int msv, String name, String cl, String date , double gpa) throws ParseException{
        this.name=name;
        this.cl=cl;
        this.gpa = gpa;
        this.msv="B20DCCN"+String.format("%03d",msv);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.date = sdf.format(sdf.parse(date));
    }
    public String toString(){
        return msv+" "+name+" "+cl+" "+date+" "+String.format("%.2f",gpa);
    }
}
