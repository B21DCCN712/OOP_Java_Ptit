package J04007;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String date = sc.nextLine();
        String address = sc.nextLine();
        String code_tax = sc.nextLine();
        String day_contract = sc.nextLine();
        Employee e = new Employee(name, sex, date, address, code_tax, day_contract);
        System.out.println(e);
    }
}
