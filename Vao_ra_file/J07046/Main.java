package J07046;

import java.io.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        ArrayList<KHACH> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(in.nextLine());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for( int i=1 ; i<=n ; i++){
            String name=in.nextLine();
            String ma=in.nextLine();
            String den=in.nextLine();
            String di=in.nextLine();
            Date start = sdf.parse(den);
            Date end=sdf.parse(di);
            Long time=-( start.getTime()-end.getTime() ) / ( 24 * 60 * 60 * 1000);
            ds.add(new KHACH(name,ma,time));
        }
        Collections.sort(ds);
        for(KHACH tmp : ds){
            System.out.println(tmp);
        }
    }
}
