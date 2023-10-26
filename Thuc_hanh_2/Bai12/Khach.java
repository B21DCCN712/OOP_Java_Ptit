package Bai12;

public class Khach {
    static int makhach=1;
    private String id, name, gioitinh, date, address;
    public Khach(String name, String gioitinh, String date,String address){
        this.id="KH"+String.format("%03d",makhach++);
        this.name =name;
        this.gioitinh=gioitinh;
        this.date=date;
        this.address=address;
    }
}
