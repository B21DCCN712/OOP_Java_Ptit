package J05024;

public class Student implements Comparable <Student> {
    private String msv , name , cl , email;
    public Student(String msv , String name,String cl,String email){
        this.msv =msv;
        this.name=name;
        this.cl=cl;
        this.email=email;
    }
    public String getmsv(){
        String s= msv.substring(5,7);
        if(s.equals("CN") && cl.charAt(0)!='E') return "CNTT";
        else if (s.equals("AT") && cl.charAt(0)!='E') return "ATTT";
        else if (s.equals("KT")) return "KT";
        else if (s.equals("VT")) return "VT";
        else if (s.equals("DT")) return "DT";
        else return "";
    }
    public String toString(){
        return msv+" "+name+" "+cl+" "+email;
    }
    public int compareTo(Student o){
         return this.msv.compareTo(o.msv);
    }
}