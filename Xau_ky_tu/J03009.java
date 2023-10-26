import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;

public class J03009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau số lượng bộ test

        for (int t = 0; t < numTests; t++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            String[] words1 = s1.split(" ");
            String[] words2 = s2.split(" ");
            Set<String> set1 = new HashSet<>(Arrays.asList(words1));
            Set<String> set2 = new HashSet<>(Arrays.asList(words2));
            Set<String> set3 = new HashSet<>();


            for (String word : set1) {
                if (!set2.contains(word)) {
                    set3.add(word);
                }
            }

            for(String x : set3){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
