package J05025;

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
        Collections.sort(list);
        for(Teacher i : list) System.out.println(i);
    }
}
