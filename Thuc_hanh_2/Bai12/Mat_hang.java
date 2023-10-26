package Bai12;

public class Mat_hang {
    static int mamathang=1;
    private String id, name,donvi ;
    private int giamua,giaban;
    public int socai,sotien;
    public Mat_hang(String name,String donvi,int giamua,int giaban){
        this.id = "MH" + String.format("%03d", mamathang++);
        this.name =name;
        this.donvi = donvi;
        this.giaban = giaban;
        this.giamua = giamua;
    }
    
}
