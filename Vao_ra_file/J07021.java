import java.io.*;
import java.util.*;
public class J07021 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine().toLowerCase().trim();
            if (s.equals("end")){
                break;
            }
            String[] a = s.split("\\s+");
            for(String i : a){
                System.out.print(i.substring(0, 1).toUpperCase() + i.substring(1 ) +" ");
            }
            System.out.println();
        }
    }
}
