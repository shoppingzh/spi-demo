package com.littlezheng;

import java.util.Iterator;
import java.util.ServiceLoader;

public class LogFactory {

    public static Logger getLogger(Class<?> clz) {
        ServiceLoader<Logger> serviceLoader = ServiceLoader.load(Logger.class);
        Iterator<Logger> it = serviceLoader.iterator();
        return (it == null || !it.hasNext()) ? NonLogger.getInstance() : it.next();
    }
    
}
