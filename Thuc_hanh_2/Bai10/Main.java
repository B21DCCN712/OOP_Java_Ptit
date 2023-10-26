package Bai10;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<SinhVien> list1 = new ArrayList<>();
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t=0;
        while(sc.hasNextLine()){
            list1.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        sc = new Scanner(new File("HUONGDAN.in"));
        t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String x = sc.nextLine();
            String[] arr=x.split("\\s+");
            String name="";
            for(int i=0 ; i<arr.length-1 ; i++){
                name = name + arr[i]+" ";
            }
            int n=Integer.parseInt(arr[arr.length-1]);
            for(int i=1 ; i<=n ; i++){
                String x1=sc.nextLine();
                String[] arr1 = x1.split("\\s+");
                String doan="";
                for(int j=1 ; j<arr1.length ; j++) doan = doan+arr1[j]+" ";
                for(SinhVien sinhvien : list1){
                    if (sinhvien.getMsv().equals(arr1[0])){
                        sinhvien.setGiangvien(name.trim());
                        sinhvien.getDoan(doan.trim());
                        break;
                    }
                }
            }
        }
        Collections.sort(list1);
        for(SinhVien x : list1) {
            if( x.getGiangvien().compareTo("") != 0)System.out.println(x);
        }
    }
}
