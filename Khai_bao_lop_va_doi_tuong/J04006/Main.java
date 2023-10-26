package J04006;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String cl = sc.nextLine();
        String date = sc.nextLine();
        double gpa = sc.nextDouble();
        Student st = new Student(name,cl,date,gpa);
        System.out.println(st);
    }
}
