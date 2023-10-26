package J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<City> list = new ArrayList<>();
        while(t-->0){
            list.add(new City(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+"  DEN "+b+" SINH VIEN:");
            for(City i : list) {
                if(i.getNumber() >=a && i.getNumber() <=b)System.out.println(i);
            }
        }
    }
}
