package J05010;
public class Mat_hang implements Comparable<Mat_hang> {
    private int id;
    private String name,group;
    private float giamua, giaban , loinhuan;
    static int res=1;
    public Mat_hang(String name,String group , float giamua,float giaban){
        this.id=res++;
        this.name=name;
        this.group=group;
        this.giamua=giamua;
        this.giaban=giaban;
        this.loinhuan = giaban-giamua;
    }
    public String toString(){
        return id+" "+name+" "+group+" "+String.format("%.2f",loinhuan);
    }
    public int compareTo(Mat_hang x){
        if (this.loinhuan < x.loinhuan ) return 1;
        else return -1;
    }
}
