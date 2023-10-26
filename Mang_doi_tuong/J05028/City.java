package J05028;

public class City implements Comparable<City> {
    private String id,name;
    private int number;
    public City(String id,String name,int number){
        this.id=id;
        this.name=name;
        this.number=number;
    }

    public int compareTo(City o){
        if(this.number == o.number) return this.id.compareTo(o.id);
        else if (this.number > o.number ) return -1;
        else return 1;
    }
    public String toString(){
        return id+" "+name+" "+number;
    }
}
