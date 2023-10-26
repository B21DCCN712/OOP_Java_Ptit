package J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;;
public class Student {
    private String id, name , cl, date;
    private double gpa;
    public Student(){
        this.id = "B20DCCN001";
        this.name="";
        this.cl="";
        this.date="";
        this.gpa = 0;
    }
    public Student(String name , String cl , String date, double gpa){
        this.id = "B20DCCN001";
        this.name=name;
        this.cl=cl;
        this.gpa = gpa;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date d = df.parse(date);
            this.date = df.format(d);
        }catch(ParseException e){

        }
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCl(String cl){
        this.cl = cl;
    }
    public String getCl(){
        return cl;
    }
    public void setDate(String date){
        this.date=date;
    }
    public String getDate(){
        return date;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    public double getGpa(){
        return gpa;
    }
    public String toString(){
        String s = id +" " + name + " " + cl + " " + date + " " + String.format("%.2f" , gpa);
        return s;
    }
}
