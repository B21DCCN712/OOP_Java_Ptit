package J07046;

public class KHACH implements Comparable<KHACH> {
    static int Id=1;
    private String id,name,ma;
    private long cutru;
    public KHACH(String name, String ma, long cutru){
        this.id = "KH" +String.format("%02d",Id++);
        this.name =name;
        this.ma=ma;
        this.cutru = cutru;
    }
    @Override
    public int compareTo(KHACH x){
        return (int) (-this.cutru+x.cutru);
    }
    @Override
    public String toString(){
        return id+" "+name+" "+ma+" "+cutru;
    }
}
