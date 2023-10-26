package J07050;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException  {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Item> list = new ArrayList<>();
        while(t-->0){
            list.add(new Item(sc.nextLine(), sc.nextLine(),Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(Item i:list){
            System.out.println(i);
        }
    }
}
