package J05009;

public class Student implements Comparable<Student>{
    private String date,name;
    private int id;
    private float diemtb;
    static int res=1;
    public Student(String name,String date,float diem1,float diem2,float diem3){
        this.id=res++;
        this.name =name;
        this.date =date;
        this.diemtb = diem1 + diem2 + diem3;
    }
    public float getDiemtb(){
        return diemtb;
    }
    public String toString(){
        return id+" "+name+" "+date+" "+diemtb;
    }
    public int compareTo(Student x){
        if(this.diemtb == x.diemtb) return this.id-x.id;
        else return (int) (this.diemtb - x.diemtb);
    }
}
