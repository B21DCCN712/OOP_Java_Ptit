package J05011;

public class Time implements Comparable<Time> {
    private String id,name;
    private int hv,hr,pv,pr,gio,phut;
    public Time(String id , String name , String giovao , String giora){
        this.id = id;
        this.name =name;
        String[] a=giovao.split(":");
        String[] b=giora.split(":");
        this.hv = Integer.parseInt(a[0]);
        this.hr = Integer.parseInt(b[0]);
        this.pv = Integer.parseInt(a[1]);
        this.pr = Integer.parseInt(b[1]);
        if (this.pv >  this.pr ) {
            this.phut = 60 + this.pr - this.pv;
            this.hr -=1;
        }
        else this.phut = this.pr - this.pv;
        this.gio = this.hr - this.hv;
    }
    public String toString(){
        return id + " "+name+" "+gio +" gio "+phut+" phut";
    }
    public int compareTo(Time o){
        if (this.gio < o.gio ) return 1;
        else if (this.gio > o.gio ) return -1;
        else if (this.phut < o.phut ) return 1;
        else return -1;
    }
}
