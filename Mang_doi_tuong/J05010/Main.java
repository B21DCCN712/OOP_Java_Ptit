package J05010;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        ArrayList<Mat_hang> list = new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String group=sc.nextLine();
            float giamua=Float.parseFloat(sc.nextLine());
            float giaban=Float.parseFloat(sc.nextLine());
            list.add(new Mat_hang(name, group, giamua, giaban));
        }
        Collections.sort(list);
        for(Mat_hang i : list){
            System.out.println(i);
        }
    }
}
