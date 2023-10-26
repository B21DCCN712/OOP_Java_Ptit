package J05033;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
         ArrayList<Time> list = new ArrayList<>();
        while(t-->0){
            list.add(new Time(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(list);
        for(Time i : list){
            System.out.println(i);
        }
    }
}
