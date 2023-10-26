package J05020;

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
        if(this.cl.equals(o.cl)) return this.msv.compareTo(o.msv);
        else return this.cl.compareTo(o.cl);

    }
}