package J07053;

public class Thi_sinh {
    static int res=1;
    private String id,name,date,hocluc;
    private float diem1,diem2;
    double diemcong;
    private int diemtb,tuoi;
    public Thi_sinh(String name, String date,float diem1, float diem2){
        this.id = "PH"+String.format("%02d",res++);
        this.diem1=diem1;
        this.diem2=diem2;
        this.date=date;
        this.name =chuanhoa(name).trim();
        this.tuoi =2021 - Integer.parseInt(date.substring(date.length()-4));
        if(diem1>=8 && diem2>=8) this.diemcong=1;
        else if (diem1>=7.5 && diem2>=7.5) this.diemcong=0.5;
        else diemcong=0;
        this.diemtb=(int) Math.round( ((diem1+diem2)/2 + diemcong) );
        if (diemtb>=10) diemtb=10;
        if (diemtb<5) this.hocluc="Truot";
        else if(diemtb==5 || diemtb==6) this.hocluc="Trung binh";
        else if (diemtb==7) this.hocluc="Kha";
        else if (diemtb==8) this.hocluc="Gioi";
        else this.hocluc="Xuat sac";
    }
    public String toString(){
        return id +" "+name+" "+tuoi+" "+diemtb+" "+hocluc;
    }
    public String chuanhoa(String a){
        a=a.trim().toLowerCase();
        String[] s = a.split("\\s+");
        String res="";
        for(int i=0 ; i<s.length ; i++){
            res += s[i].substring(0,1).toUpperCase()+ s[i].substring(1) +" ";
        }
        return res;
    }
}
