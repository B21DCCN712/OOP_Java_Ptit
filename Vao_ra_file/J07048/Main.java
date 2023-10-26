package J07048;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<Product> list = new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            int giaban=Integer.parseInt(sc.nextLine());
            int hsd = Integer.parseInt(sc.nextLine());
            list.add( new Product(id, name, giaban, hsd));
        }
        Collections.sort(list);
        for(Product i : list){
            System.out.println(i);
        }
    }
}
