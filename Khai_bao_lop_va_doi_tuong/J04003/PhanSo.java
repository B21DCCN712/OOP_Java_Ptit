package J04003;

public class PhanSo {
    private long tuso,mauso;

    public PhanSo(long tuso, long mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public void setTuso(long tuso){
        this.tuso = tuso;
    }
    public void setMauso(long mauso){
        this.mauso = mauso;
    }
    public long getTuso(){
        return tuso;
    }
    public long getMauso(){
        return mauso;
    }

    public static long gcd(long a, long b){
        if ( b == 0 ){
            return a;
        }
        return gcd(b,a%b);
    }
    public void rutgon(){
        long GCD = gcd(tuso,mauso);
        this.tuso = tuso / GCD;
        this.mauso = mauso / GCD;
    }
    public String toString(){
        String s = String.valueOf(tuso) + "/" + String.valueOf(mauso);
        return s;
    }
}
