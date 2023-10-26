package J05006;

public class Nhan_vien {
    static int res=1;
    private String id,name,sex,date,address,tax,day;
    public Nhan_vien(String name, String sex, String date,String address, String tax,String day){
        this.name =name;
        this.sex =sex;
        this.date =date;
        this.address =address;
        this.tax=tax;
        this.day=day;
        this.id=String.format("%05d", res++);
    }
    public String toString(){
        return id+" "+name+" "+sex+" "+date+" "+address+" "+tax+" "+day;
    }
}
