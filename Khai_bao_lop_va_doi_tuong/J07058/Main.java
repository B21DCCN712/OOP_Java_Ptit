package J07058;
import java.util.*;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<Subject> subjects = new ArrayList<>();
        while(t-->0){
            subjects.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        subjects.sort(new Comparator<Subject>() {
            public int compare(Subject a, Subject b){
                return a.getId().compareTo(b.getId());
            }
        });
        for ( Subject i : subjects){
            System.out.println(i);
        }
    }
}
