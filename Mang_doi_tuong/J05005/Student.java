package J05005;

public class Student implements Comparable<Student>{
    static int id=1;
    private String msv,name , cl , date;
    private double gpa;
    public String chuanhoa(String s){
        String[] a=s.trim().split("\\s+");
        String res="";
        for(int i=0 ; i<a.length ; i++){
            res=res + a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }
    public Student(String name, String cl , String date,double gpa){
        this.msv = "B20DCCN" + String.format("%03d",id++);
        this.name=chuanhoa(name);
        this.date=date;
        this.cl = cl;
        this.gpa=gpa;
    }
    public int compareTo(Student x){
        if (this.gpa < x.gpa) return 1;
        else return -1;
    }
    public String toString(){
        return msv + " " + name +" "+cl +" "+date+" "+String.format("%.2f", gpa);
    }

}
