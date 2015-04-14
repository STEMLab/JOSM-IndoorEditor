package it.trilogis.josm.pesce;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.io.remotecontrol.PermissionPrefWithDefault;
import org.openstreetmap.josm.io.remotecontrol.handler.RequestHandler;

public class SetContextHandler extends RequestHandler {

    public static final String command = "setcontext";
    
    private Context context;
    
    public SetContextHandler() {
        Main.debug("Initializate Context");
        context = Context.getInstance();
    }
    
    @Override
    protected void validateRequest() throws RequestHandlerBadRequestException {
        
    }

    @Override
    protected void handleRequest() throws RequestHandlerErrorException, RequestHandlerBadRequestException {
        context.store.putAll(args);
    }

    @Override
    public String getPermissionMessage() {
        return null;
    }

    @Override
    public PermissionPrefWithDefault getPermissionPref() {
        return null;
    }

    @Override
    public String[] getMandatoryParams() {
        return new String[]{ "token" };
    }

    static public class Context {
        static private Context instance = null;
        
        public Map<String,String> store;
        
        private Context() {
            Main.debug("Initializate Store");
            store = Collections.synchronizedMap(new HashMap<String,String>());
            Main.debug("Store obj: "+store);
        }
        static public Context getInstance() {
            if(null == instance) {
                instance = new Context();
            }
            return instance;
        }
    }

}
