package J07052;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id, name;
    private double uutien,toan,li,hoa,sum;
    public String chuanhoa(String a){
        a=a.trim().toLowerCase();
        String[] s = a.split("\\s+");
        String res="";
        for(int i=0 ; i<s.length ; i++){
            res += s[i].substring(0,1).toUpperCase()+ s[i].substring(1) +" ";
        }
        return res;
    }
    public double getSum(){
        return sum;
    }
    public String getd(){
        if (sum==(int)(sum)) return Integer.toString((int) sum);
        else return Double.toString(sum);
    }
    public String getD(){
        if (uutien==(int)(uutien)) return Integer.toString((int) uutien);
        else return Double.toString(uutien);
    }

    public ThiSinh(String id, String name,double toan, double li , double hoa){
        this.id=id;
        this.name =chuanhoa(name).trim();
        this.toan=toan;
        this.li =li;
        this.hoa=hoa;
        if (id.charAt(2)=='1') this.uutien =0.5;
        else if (id.charAt(2)=='2') this.uutien =1;
        else this.uutien = 2.5;
        this.sum = toan*2+li+hoa+uutien;
    }

    public String toString(){
        return id+" "+name+" "+getD()+" "+getd();
    }

    public int compareTo(ThiSinh x){
        if (this.sum > x.sum) return -1;
        else if (this.sum < x.sum) return 1;
        else return this.id.compareTo(x.id);
    }
}
