package it.trilogis.josm.pesce;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openstreetmap.josm.data.osm.DataSet;

/**
 * @author martino.salvetti
 * Save further information binded to a DataSet in order to preserve them
 * from the import to the export.
 */
@Deprecated
public class TransactionIds implements Map<TransactionIds.Tx, String> {

    private static Map<DataSet,TransactionIds> instances = null;
    
    public static class Tx {
        public String start, end;
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((end == null) ? 0 : end.hashCode());
            result = prime * result + ((start == null) ? 0 : start.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Tx other = (Tx) obj;
            if (end == null) {
                if (other.end != null)
                    return false;
            } else if (!end.equals(other.end))
                return false;
            if (start == null) {
                if (other.start != null)
                    return false;
            } else if (!start.equals(other.start))
                return false;
            return true;
        }
        public Tx(String start, String end) {
            this.start = start;
            this.end = end;
        }
    }
    
    private Map<Tx, String> allNames;
     
    public static TransactionIds getInstance(DataSet ds) {
        if(null==instances) {
            instances = new HashMap<>();
        }
        if(!instances.containsKey(ds)) {
            instances.put(ds,new TransactionIds());
        }
        return instances.get(ds);
    }
    
    private TransactionIds() {
        allNames = new HashMap<>();
    }

    @Override
    public int size() {
        return allNames.size();
    }

    @Override
    public boolean isEmpty() {
        return allNames.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return allNames.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return allNames.containsValue(value);
    }

    @Override
    public String get(Object key) {
        return allNames.get(key);
    }

    @Override
    public String put(Tx key, String value) {
        return allNames.put(key, value);
    }

    @Override
    public String remove(Object key) {
        return allNames.remove(key);
    }

    @Override
    public void putAll(Map<? extends Tx, ? extends String> m) {
        allNames.putAll(m);
    }

    @Override
    public void clear() {
        allNames.clear();
        
    }

    @Override
    public Set<Tx> keySet() {
        return allNames.keySet();
    }

    @Override
    public Collection<String> values() {
        return allNames.values();
    }

    @Override
    public Set<java.util.Map.Entry<Tx, String>> entrySet() {
        return allNames.entrySet();
    }
    
    
}
