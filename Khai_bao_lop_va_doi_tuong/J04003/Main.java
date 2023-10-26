package J04003;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo p = new PhanSo(a,b);
        p.rutgon();
        System.out.print(p);
    }
}
