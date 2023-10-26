import java.util.*;
import java.io.*;
public class J07040 {
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list = (ArrayList<String>)in.readObject();
        Set<String> s1 = new TreeSet<>();
        ArrayList<String>  s2 = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim().toLowerCase();
            s2.addAll(Arrays.asList(s.split("\\s+")));
        }
        for(String i : list){
            s1.addAll(Arrays.asList(i.trim().toLowerCase().split("\\s+")));
        }
        for(String i : s2){
            if(s1.contains(i)){
                System.out.println(i);
                s1.remove(i);
            }
        }
    }
}
