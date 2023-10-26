package J05021;

public class Student implements Comparable <Student> {
    private String msv , name , cl , email;
    public Student(String msv , String name,String cl,String email){
        this.msv =msv;
        this.name=name;
        this.cl=cl;
        this.email=email;
    }
    public String toString(){
        return msv+" "+name+" "+cl+" "+email;
    }
    public int compareTo(Student o){
         return this.msv.compareTo(o.msv);
    }
}