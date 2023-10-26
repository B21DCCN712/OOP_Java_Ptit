package Bai11;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        ArrayList<San_pham> a = new ArrayList<>();
        ArrayList<Khach> b = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0)
            a.add(new San_pham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++)
            b.add(new Khach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        for(San_pham x : a){
            for(Khach y : b)
                if(x.ma.equals(y.maSP)){
                    y.setngay(x.time);
                    y.settien(x.giaban);
                }
        }
        Collections.sort(b, Comparator.comparingInt(Khach::getyear).thenComparing(Khach::getmonth).thenComparing(Khach::getdays));
        for(Khach x : b)
            System.out.println(x);
    }
}
