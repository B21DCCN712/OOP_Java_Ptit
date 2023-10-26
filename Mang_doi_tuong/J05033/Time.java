package J05033;

public class Time implements Comparable<Time> {
    private int gio,phut,giay;
    public Time(int gio, int phut, int giay){
        this.gio=gio;
        this.phut=phut;
        this.giay=giay;
    }
    public String toString(){
        return gio+" "+phut+" "+giay;
    }
    public int compareTo(Time e){
        if( this.gio != e.gio){
            return this.gio -e.gio;
        }
        else if( this.phut != e.phut){
            return this.phut - e.phut;
        }
        else return this.giay-e.giay;
    }
}
