package J05005;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Student> list = new ArrayList<>();
        
        while(t-->0){
            String name=sc.nextLine();
            String cl=sc.nextLine();
            String date=sc.nextLine();
            date = sdf.format(sdf.parse(date));
            double gpa=Double.parseDouble(sc.nextLine());
            Student s= new Student(name, cl, date, gpa);
            list.add(s);
        }
        Collections.sort(list);
        for(Student x : list) System.out.println(x);
    }
}
