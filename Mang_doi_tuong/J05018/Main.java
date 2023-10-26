package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            String name=sc.nextLine();
            float diemtb=0;
            for(int i=0 ; i<10 ; i++){
                float x =sc.nextFloat();
                if ( i==0 || i==1 ) diemtb = diemtb + 2*x;
                else diemtb +=x;
            }
            diemtb /= 12;
            list.add(new Student(name,diemtb));
        }
        Collections.sort(list);
        for(Student i : list) System.out.println(i);
    }
}
