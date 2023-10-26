package J07048;

public class Product implements Comparable<Product> {
    private String id,name;
    private int giaban,hsd;
    public Product(String id,String name,int giaban,int hsd){
        this.id=id;
        this.name=name;
        this.giaban = giaban;
        this.hsd=hsd;
    }
    public int compareTo(Product x){
        if (this.giaban == x.giaban){
            return this.id.compareTo(x.id);
        }
        else return (int) (x.giaban - this.giaban);
    }
    public String toString(){
        return id+" "+name+" "+giaban+" "+hsd;
    }
}
