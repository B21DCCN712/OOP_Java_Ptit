package J05026;

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
            String s=sc.nextLine().toUpperCase();
            String res="";
            String[] s1=s.split("\\s+");
            for(int i=0 ; i<s1.length ; i++) res += s1[i].charAt(0);
            System.out.println("DANH SACH GIANG VIEN BO MON "+res+":");
            for(Teacher i : list){
                if (i.getBomon().equals(res)) System.out.println(i);
            }
        }
    }
}
