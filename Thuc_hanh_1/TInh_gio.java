
import java.io.File;
import java.util.*;

class MH{
    public String maMH, tenMH;
    public MH(String ma, String ten){
        this.maMH = ma;
        this.tenMH = ten.trim();
    }
}
class GV{
    private String maGV, tenGV;
    private float time;
    public GV(String ma, String ten){
        this.maGV = ma;
        this.tenGV = ten.trim();
    }
    public void settime(float a){
        this.time += a;
    }
    public String getma(){
        return maGV;
    }
    @Override
    public String toString(){
        return tenGV + " " + String.format("%.2f", time);
    }
}
public class TInh_gio{
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(new File("MONHOC.in"));
        Scanner sc = new Scanner(new File("GIANGVIEN.in"));
        Scanner sc1 = new Scanner(new File("GIOCHUAN.in"));
        int n = in.nextInt();
        ArrayList<MH> a = new ArrayList<>();
        ArrayList<GV> b = new ArrayList<>();
        while(n-- > 0)
            a.add(new MH(in.next(), in.nextLine()));
        int m = sc.nextInt();
        while(m-- > 0)
            b.add(new GV(sc.next(), sc.nextLine()));
        int q = sc1.nextInt();
        while(q-- > 0){
            String s = sc1.next(), s1 = sc1.next();
            float x = sc1.nextFloat();
            for(int i = 0; i < b.size(); i++)
                if(s.equals(b.get(i).getma()))
                    b.get(i).settime(x);
        }
        for(GV x : b)
            System.out.println(x);
    }
}