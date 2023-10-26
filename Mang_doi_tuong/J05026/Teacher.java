package J05026;

public class Teacher implements Comparable<Teacher> {
    private String id,fullname,name,bomon;
    static int res=1;
    public Teacher(String fullname,String bomon){
        this.id="GV"+String.format("%02d", res++);
        this.fullname=fullname;
        String[] s1=fullname.split("\\s+");
        this.name=s1[s1.length-1];
        String res="";
        String[] s2=bomon.split("\\s+");
        for(int i=0 ; i<s2.length ; i++) res += s2[i].charAt(0);
        this.bomon=res.toUpperCase();
    }
    public String getBomon(){
        return bomon;
    }
    public String toString(){
        return id+" "+fullname+" "+bomon;
    }
    public int compareTo(Teacher o){
        return this.name.compareTo(o.name);
    }
}
