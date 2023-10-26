import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
public class Kiem_tra_chia_het {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("E:\\Ki_1_nam_3\\Lap_trinh_huong_doi_tuong\\luyen tap\\DATA.in"));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger a = new BigInteger(sc.nextLine());
            boolean chia7 = a.remainder(BigInteger.valueOf(7)).equals(BigInteger.ZERO);
            boolean chia13 = a.remainder(BigInteger.valueOf(13)).equals(BigInteger.ZERO);
            if(chia7 && chia13){
                System.out.println("Both");
            }
            else if(chia7){
                System.out.println("Div 7");
            }
            else if(chia13){
                System.out.println("Div 13");
            }
            else{
                System.out.println("None");
            }

        }
    }
}
