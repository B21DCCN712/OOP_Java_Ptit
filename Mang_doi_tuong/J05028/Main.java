package J05028;

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
        for(City i : list) System.out.println(i);
    }
}
