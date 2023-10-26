package Bai9;

import java.io.*;
import java.util.*;

public class Main {
     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<Student>list = new ArrayList<>();
        while(sc.hasNextLine()){
            Student a = new Student(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(a);
        }
        Collections.sort(list);
        for(Student i : list){
            System.out.println(i);
        }

    }
}
