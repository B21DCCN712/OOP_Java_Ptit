package J07010;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t=sc.nextInt();
        for( int i=1 ; i<=t ; i++){
            sc.nextLine();
            Student st = new Student(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble());
            System.out.println(st);
        }
    }
}
