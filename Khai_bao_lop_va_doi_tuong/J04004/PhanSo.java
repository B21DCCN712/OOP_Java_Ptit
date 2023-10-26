package J04004;

public class PhanSo {
    private long tuso,mauso;

    public PhanSo(long tuso, long mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public PhanSo(){

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
    public PhanSo addPhanSo(PhanSo a){
        PhanSo c = new PhanSo();
        c.mauso = a.mauso * this.mauso / gcd(a.mauso, this.mauso);
        c.tuso = (c.mauso / a.mauso ) * a.tuso + ( c.mauso / this.mauso ) * this.tuso;
        c.rutgon();
        return c;
    }
    public String toString(){
        String s = String.valueOf(tuso) + "/" + String.valueOf(mauso);
        return s;
    }
}
