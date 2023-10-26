package J05007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Nhan_vien> list = new ArrayList<>();
        while(t-->0){
            Nhan_vien nv = new Nhan_vien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(nv);
        }
        Collections.sort(list);
        for(Nhan_vien i : list){
            System.out.println(i);
        }
    }
}
