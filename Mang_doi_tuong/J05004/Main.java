package J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            String name=sc.nextLine();
            String cl=sc.nextLine();
            String date=sc.nextLine();
            date = sdf.format(sdf.parse(date));
            double gpa=Double.parseDouble(sc.nextLine());
            Student s= new Student(name, cl, date, gpa);
            System.out.println(s);
        }
    }
}
