package Bai9;

public class Student implements Comparable<Student> {
    private String msv,name,lop,email,sdt;
    public Student(String msv , String name , String lop , String email , String sdt){
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt = "0"+sdt;
    }
    public String toString(){
        return msv+" "+name+" "+lop+" "+email+" "+sdt;
    }
    public int compareTo(Student x){
        if(this.lop.equals(x.lop)){
            return this.msv.compareTo(x.msv);
        }
        return this.lop.compareTo(x.lop);
    }
}
