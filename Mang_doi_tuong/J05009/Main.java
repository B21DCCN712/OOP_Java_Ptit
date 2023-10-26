package J05009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Student> list = new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String date=sc.nextLine();
            float diem1=Float.parseFloat(sc.nextLine());
            float diem2=Float.parseFloat(sc.nextLine());
            float diem3=Float.parseFloat(sc.nextLine());
            list.add(new Student(name, date, diem1, diem2, diem3));
        }
        Collections.sort(list);
        float diemtb=list.get(list.size()-1).getDiemtb();
        for(Student i : list){
            if( i.getDiemtb() == diemtb) System.out.println(i);
        }
    }
}
