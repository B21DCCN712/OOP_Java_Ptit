package J04007;

public class Employee {
    private String mnv , name , sex , date , address , code_tax , day_contract;
    public Employee(String name, String sex, String date, String address,String code_tax, String dat_contract){
        this.mnv = "00001";
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
        this.code_tax = code_tax;
        this.day_contract = dat_contract;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setCode_tax(String code_tax){
        this.code_tax = code_tax;
    }
    public String getCode_tax(){
        return code_tax;
    }
    public void setDay_contract(String contract){
        this.day_contract = day_contract;
    }
    public String getDay_contract(){
        return day_contract;
    }
    public String toString(){
        String s = mnv + " " + name + " " + sex + " " + date + " " + address + " " + code_tax + " " + day_contract;
        return s;
    }
}
