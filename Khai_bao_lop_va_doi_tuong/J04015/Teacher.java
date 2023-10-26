package J04015;

public class Teacher {
    private String position,name,id;
    private long heso , luong , phucap;
    public Teacher(String id , String name , long luong){
        this.id = id;
        this.name = name;
        this.luong = luong;
        this.heso = Integer.parseInt(id.substring(2,4));
        this.position=id.substring(0, 2);
        if ( position.equals("HT")){
            this.phucap = 2000000;
        }
        else if ( position.equals("HP")){
            this.phucap = 900000;
        }
        else this.phucap = 500000;
    }
    public String getPosition(){
        return position;
    }
    public long getHeso(){
        return heso;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLuong(long luong){
        this.luong = luong;
    }
    public long getLuong(){
        return luong;
    }
    public String toString(){
        String s = id + " " + name + " " + String.valueOf(heso) + " "+ String.valueOf(phucap) + " " + String.valueOf(luong*heso+phucap);
        return s;
    }
}
