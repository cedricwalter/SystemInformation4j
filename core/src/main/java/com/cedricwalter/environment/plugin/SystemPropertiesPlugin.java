package com.cedricwalter.environment.plugin;

import com.cedricwalter.environment.Tuple;

import java.util.Enumeration;
import java.util.Set;
import java.util.TreeSet;

public class SystemPropertiesPlugin implements EnvironmentPlugin {

    public Set<Tuple> getProperties() {
        Set<Tuple> set = new TreeSet();

        Enumeration e = System.getProperties().propertyNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = System.getProperty(key);
            set.add(new Tuple<String>(key, value));
        }

        return set;
    }

    public String getTitle() {
        return "System properties";
    }

}
