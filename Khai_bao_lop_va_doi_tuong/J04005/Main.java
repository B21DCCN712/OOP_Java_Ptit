package J04005;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String date = sc.nextLine();
        double diem1  = sc.nextDouble();
        double diem2  = sc.nextDouble();
        double diem3  = sc.nextDouble();
        Student st = new Student(name, date, diem1, diem2, diem3);
        System.out.println(st);
    }
}
