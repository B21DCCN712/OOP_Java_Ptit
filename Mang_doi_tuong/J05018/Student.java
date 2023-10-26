package J05018;

public class Student implements Comparable<Student> {
    static int res=1;
    private String id,name,hocluc;
    private float diemtb;
    public Student(String name, float diemtb){
        this.id = "HS" + String.format("%02d",res++);
        this.name=name;
        this.diemtb =(float) Math.round(diemtb*10)/10;
        if (diemtb >= 9) this.hocluc = "XUAT SAC";
        else if (diemtb>=8 ) this.hocluc = "GIOI";
        else if (diemtb>=7 ) this.hocluc = "KHA";
        else if (diemtb>=5 ) this.hocluc = "TB";
        else this.hocluc = "YEU";
    }
    public String toString(){
        return id+" "+name+" "+diemtb +" "+hocluc;
    }
    public int compareTo(Student o){
        if (this.diemtb == o.diemtb ) return this.id.compareTo(o.id);
        else{
            if(this.diemtb < o.diemtb) return 1;
            else return -1;
        }
    }
}
