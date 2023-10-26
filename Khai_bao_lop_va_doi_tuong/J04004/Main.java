package J04004;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo p1 = new PhanSo(a,b);
        a = sc.nextLong();
        b = sc.nextLong();
        PhanSo p2 = new PhanSo(a,b);
        PhanSo c = new PhanSo();
        c = p1.addPhanSo(p2);
        System.out.println(c);

    }
}
