package org.example;

import java.util.*;

/**
 * 
 */
public class ServiceFactory {

    public ServiceFactory() {
    }

    private static final Map<String,ServiceType> serviceTypes=new HashMap<>();
    public ServiceType getServiceType(String category) {
        if (serviceTypes.get(category)==null){
            serviceTypes.put(category,new ServiceType(category));
        }
        return serviceTypes.get(category);
    }
}