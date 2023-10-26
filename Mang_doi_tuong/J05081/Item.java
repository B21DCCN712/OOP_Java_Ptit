package J05081;

public class Item implements Comparable<Item> {
    static int ma=1;
    private String id , name , donvi;
    private int giamua, giaban;
    private int loinhuan;
    public Item(String name, String donvi , int giamua , int giaban){
        this.id = "MH" + String.format("%03d",ma++);
        this.name =name;
        this.donvi = donvi ; 
        this.giamua = giamua;
        this.giaban = giaban ;
        this.loinhuan = giaban-giamua;
    }
    public String toString(){
        return id+" "+name+" "+donvi+" " + giamua+" "+giaban+" "+loinhuan;
    }
    @Override
    public int compareTo(Item x){
        if (this.loinhuan == x.loinhuan) return this.id.compareTo(x.id);
        else return -this.loinhuan + x.loinhuan;
    }
}
