import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Bai1 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<BigInteger> list = new ArrayList<>();
        while(t-->0){
            list.add(new BigInteger( sc.nextLine()));
        }
        BigInteger sum = new BigInteger("0");
        for(BigInteger i : list){
            sum=sum.add(i);
        }
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(sum);
    }
}
