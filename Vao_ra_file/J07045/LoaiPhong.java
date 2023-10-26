package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String id,name;
    String don_gia;
    private String phi;
    public LoaiPhong(String x){
        String[] s = x.split("\\s+");
        this.id =s[0];
        this.name=s[1];
        this.don_gia=s[2];
        this.phi=s[3];
    }
    @Override
    public int compareTo(LoaiPhong x){
        return this.name.compareTo(x.name);
    }
    @Override
    public String toString(){
        return id+" "+name+" "+don_gia+" "+phi;
    }
}
