package J07052;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            double toan=Double.parseDouble(sc.nextLine());
            double li=Double.parseDouble(sc.nextLine());
            double hoa=Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(id, name, toan,li,hoa));
        }
         Collections.sort(list);
        int chitieu=sc.nextInt();
        double diemchuan = list.get(chitieu-1).getSum();
        System.out.println(diemchuan);
        for(ThiSinh i : list){
            System.out.print(i);
            if ( i.getSum()>=diemchuan ) System.out.println(" TRUNG TUYEN");
            else System.out.println(" TRUOT");
        }
    }
}
