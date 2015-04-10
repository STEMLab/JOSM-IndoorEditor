package it.trilogis.josm.pesce;

import java.util.HashSet;

public class UtilsFromPython {
    
    public static String strip(String s) {
        return strip(s," \t\n");
    }
    
    public static String strip(String s, String chars) {
        HashSet<String> chrs = new HashSet<>();
        for(char c : chars.toCharArray()) {
            chrs.add(""+c);
        }
        while(chrs.contains(s.substring(0, 1))) {
            s = s.substring(1);
        }
        while(chrs.contains(s.substring(s.length()-1))) {
            s = s.substring(0, s.length()-1);
        }
        return s;
    }
    
    public static void print(String s) {
        System.out.println(s);
    }
}
