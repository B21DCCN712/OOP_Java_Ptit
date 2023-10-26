import java.util.*;
import java.io.*;
public class J07001 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("DATA.in"));
        while( in.hasNextLine()){
            System.out.println(in.nextLine());
        }
    }
}
