package J04005;

public class Student {
    private String name , date;
    private double diem1,diem2,diem3,tongdiem;
    public Student(){

    }
    public Student(String name , String date, double diem1, double diem2, double diem3){
        this.name = name;
        this.date = date;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tongdiem = diem1 + diem2 + diem3;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    public void setDiem1(double diem1){
        this.diem1 = diem1;
    }
    public double getDiem1(){
        return diem1;
    }
    public void setDiem2(double diem2){
        this.diem2 = diem2;
    }
    public double getDiem2(){
        return diem2;
    }
    public void setDiem3(double diem3){
        this.diem3 = diem3;
    }
    public double getDiem3(){
        return diem3;
    }
    public String toString(){
        String s = name + " " + date + " " + String.valueOf(tongdiem);
        return s;
    }
}
