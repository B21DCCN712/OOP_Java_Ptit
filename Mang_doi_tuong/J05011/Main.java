package J05011;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Time> list = new ArrayList<>();
        while(t-->0){
            list.add(new Time(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(Time i:list) System.out.println(i);
    }
}
