package J05024;

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
            String s=sc.nextLine().toUpperCase();
            String[] a=s.split("\\s+");
            String res="";
            for(int i=0 ; i<a.length ; i++) res = res + a[i].charAt(0);
            System.out.println("DANH SACH SINH VIEN NGANH "+s+":");
            for(Student i : list){
                if (i.getmsv().equals(res)) System.out.println(i);
            }
        }
    }
}
