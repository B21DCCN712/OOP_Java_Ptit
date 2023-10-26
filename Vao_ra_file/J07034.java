import java.io.*;
import java.util.*;
class subject{
    private String id,name;
    private int number;
    public subject(String id, String name, int number){
        this.id =id;
        this.name=name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return id+" "+name+" "+number;
    }
    public String getId() {
        return null;
    }
}
public class J07034 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t=sc.nextInt();
        sc.nextLine();
        List<subject> list = new ArrayList<>();
        while(t-->0){
            subject s= new subject(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            list.add(s);
        }
        Collections.sort(list,new Comparator<subject>(){
            public int compare(subject a, subject b){
                if( a.getName().compareTo(b.getName()) >0){
                    return 1;
                }
                else return -1;
            }
        });
        for(subject i:list){
            System.out.println(i);
        }
    }
}
