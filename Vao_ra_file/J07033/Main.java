package J07033;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Student> list = new ArrayList<>();
        while(t-->0){
            list.add(new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(Student i : list){
            System.out.println(i);
        }
    }
}
