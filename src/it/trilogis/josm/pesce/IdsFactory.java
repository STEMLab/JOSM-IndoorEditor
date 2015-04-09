package it.trilogis.josm.pesce;

import java.util.HashMap;
import java.util.Map;

public class IdsFactory {

    // FIXME: ids have to be unique. Ever.
    
    private final int FIRSTID = 0;
    private Map<String,Integer> lastIds;
    
    public IdsFactory() {
        lastIds = new HashMap<>();
    }
    
    public int newIntId(String type) {
        int id;
        if(lastIds.containsKey(type)) {
            id = lastIds.get(type) + 1;
        } else {
            id = FIRSTID;
        }
        lastIds.put(type, id);
        return id;
    }
    
    public String newId(String type) {
        return type + newIntId(type);
    }
    
    public String getLastId(String type) {
        return type + lastIds.get(type);
    }
}
