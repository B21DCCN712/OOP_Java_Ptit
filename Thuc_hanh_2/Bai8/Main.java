package Bai8;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lop_User> list = new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            list.add(new Lop_User(a[0], a[1]));
        }
        t=Integer.parseInt(sc.nextLine());
         while(t-->0){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            for(Lop_User i : list){
                if (i.check(a[0], a[1])){
                    i.setX(i.getX()+1);
                    break;
                }
            }
        }
        for(Lop_User i : list){
            System.out.print(i.getX()+" ");
        }
    }
}
