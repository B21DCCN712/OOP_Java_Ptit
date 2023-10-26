package J05023;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            list.add(new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+s+":");
            for(Student i : list){
                if (i.getcl().equals(s.substring(2,4))) System.out.println(i);
            }
        }
    }
}
