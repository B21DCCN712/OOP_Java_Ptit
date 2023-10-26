package J07033;

public class Student implements Comparable<Student> {
    private String msv,name,cl,email;
    public static String chuanhoa(String a){
        String[] s=a.trim().toLowerCase().split("\\s+");
        String res="";
        for(int i=0 ; i<s.length ; i++){
            res = res + s[i].substring(0,1).toUpperCase() + s[i].substring(1) +" ";
        }
        return res;
    }
    public Student(String msv, String name, String cl, String email){
        this.msv = msv;
        this.name=chuanhoa(name).trim();
        this.cl = cl;
        this.email = email;
    }
    public String toString(){
        return msv +" "+name+" "+cl+" "+email;
    }
    public int compareTo(Student x){
        return this.msv.compareTo(x.msv);
    }
}
