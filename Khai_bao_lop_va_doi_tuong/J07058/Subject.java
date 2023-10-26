package J07058;

public class Subject {
    private String id , name , form;
    public Subject(String id, String name, String form){
        this.id = id;
        this.name=name;
        this.form=form;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setForm(String form){
        this.form = form;
    }
    public String getForm(){
        return form;
    }
    public String toString(){
        String s = id + " " + name + " " + form;
        return s;
    }
}
