package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Item> list = new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String donvi=sc.nextLine();
            int giamua=Integer.parseInt(sc.nextLine());
            int giaban=Integer.parseInt(sc.nextLine());
            list.add(new Item(name, donvi, giamua, giaban));
        }
        Collections.sort(list);
        for(Item i : list){
            System.out.println(i);
        }
    }
}
