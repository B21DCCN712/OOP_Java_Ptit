import java.util.*;
class checkin{
    private int vao,ra;
    public checkin(int vao, int ra){
        this.vao=vao;
        this.ra=ra;
    }
    public int getVao(){
        return vao;
    }
    public int getRa(){
        return ra;
    }
}
public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<checkin> list = new ArrayList<>();
        while(n-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            list.add(new checkin(x, y));
        }
        list.sort(new Comparator<checkin>() {
            public int  compare(checkin a, checkin b){
                if (a.getVao()>b.getVao()) return 1;
                else return -1;
            }
        });
        int end=0;
        for(checkin i: list){
            if ( i.getVao() >= end){
                end = i.getVao();
            }
                end = end + i.getRa();
        }
        System.out.println(end);
    }

}
