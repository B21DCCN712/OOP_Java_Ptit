package J07050;

public class Item implements Comparable<Item> {
    private String id,name,group;
    private double giamua,giaban,loinhuan;
    static int i=1;
    public Item(String name, String group,double giamua , double giaban){
        this.id = "MH"+String.format("%02d",i++);
        this.name=name;
        this.group = group;
        this.loinhuan = giaban-giamua;
    }
    public int compareTo(Item x){
        return (int) (x.loinhuan - this.loinhuan);
    }
    public String toString(){
        return id +" "+name+" "+group+" "+String.format("%.2f",loinhuan);
    }
}
