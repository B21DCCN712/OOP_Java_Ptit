package J04015;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        long luong = sc.nextLong();
        Teacher t = new Teacher(id,name,luong);
        System.out.println(t);
    }
}
