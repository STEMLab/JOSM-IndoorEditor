package it.trilogis.josm.pesce;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class Utils {
    
    public static String strip(String s) {
        return strip(s," \t\n");
    }
    
    public static String strip(String s, String chars) {
        HashSet<String> chrs = new HashSet<>();
        for(char c : chars.toCharArray()) {
            chrs.add(String.valueOf(c));
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
    
    public static <E> Iterable<E> iterable(final Enumeration<E> enumeration) {
        if (enumeration == null) {
            throw new NullPointerException();
        }
        return new Iterable<E>() {
            public Iterator<E> iterator() {
                return new Iterator<E>() {
                    public boolean hasNext() {
                        return enumeration.hasMoreElements();
                    }
                    public E next() {
                        return enumeration.nextElement();
                    }
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }  
}
