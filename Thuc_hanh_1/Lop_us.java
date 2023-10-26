import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lop_us{

    static class User{
        private String user, pass;
        private int x = 0;
        public User(String user, String pass){
            this.user = user;
            this.pass = pass;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public boolean check (String u, String p ){
            if ( u.equals(user) && p.equals(pass) ) return true;
            return false;
        }

        @Override
        public String toString(){
            return "" + x;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<User> ar = new ArrayList<>();
        while(t-->0){
            String x = sc.nextLine();
            String arr[] = x.split("\\s+");
            ar.add( new User(arr[0],arr[1]) );
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String x = sc.nextLine();
            String arr[] = x.split("\\s+");
            for ( User k : ar ){
                if ( k.check(arr[0],arr[1]) == true ){
                    k.setX(k.getX()+1);
                }
            }
        }
        for ( User x : ar ){
            System.out.print(x + " ");
        }
    }
}