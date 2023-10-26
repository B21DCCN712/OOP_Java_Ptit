package J07053;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            Thi_sinh s = new Thi_sinh(sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()));
            System.out.println(s);
        }
    }
}
