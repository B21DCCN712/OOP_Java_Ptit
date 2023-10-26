import java.io.*;
import java.util.*;
class doanh_nghiep{
    private String id,name;
    private int number;
    public doanh_nghiep(String id, String name, int number){
        this.id =id;
        this.name=name;
        this.number = number;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return id+" "+name+" "+number;
    }
}
public class J07037 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t=sc.nextInt();
        sc.nextLine();
        List<doanh_nghiep> list = new ArrayList<>();
        while(t-->0){
            doanh_nghiep s= new doanh_nghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            list.add(s);
        }
        Collections.sort(list,new Comparator<doanh_nghiep>(){
            public int compare(doanh_nghiep a, doanh_nghiep b){
                if( a.getId().compareTo(b.getId()) >0){
                    return 1;
                }
                else return -1;
            }
        });
        for(doanh_nghiep i:list){
            System.out.println(i);
        }
    }
}
