package J07007;

import java.util.*;
//import java.util.Set;
import java.util.TreeSet;
import java.io.*;
public class WordSet {
    private Set<String> S = new TreeSet<>();
    public WordSet(String s) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(s));
        while(sc.hasNext()){
            S.add(sc.next().toLowerCase());
        }
    }
    @Override
    public String toString(){
        String res="";
        for(String i : S){
            res+= i+"\n";
        }
        return res;
    }
}
