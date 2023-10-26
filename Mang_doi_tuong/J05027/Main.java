package J05027;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> list = new ArrayList<>();
        while(t-->0){
            list.add(new Teacher(sc.nextLine(),sc.nextLine()));
        }
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            s=s.toUpperCase();
            for(Teacher i : list){
                if(i.getFullname().toUpperCase().contains(s)) System.out.println(i);
            }
        }
    }
}
