package com.cedricwalter.environment.plugin;

import com.cedricwalter.environment.Tuple;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Set;
import java.util.TreeSet;

public class ClasspathPlugin implements EnvironmentPlugin {

    public Set<Tuple> getProperties() {
        Set<Tuple> set = new TreeSet();

        ClassLoader classLoader = getClass().getClassLoader();
        addClassLoader(set, classLoader);

        ClassLoader parent = classLoader.getParent();
        while(parent != null) {
            addClassLoader(set, parent);
            parent = parent.getParent();
        }

        return set;
    }

    public String getTitle() {
        return "Class path (top -> down priority)";
    }

    private void addClassLoader(Set<Tuple> set, ClassLoader classLoader) {
        if (classLoader instanceof URLClassLoader) {
            URL[] urLs = ((URLClassLoader) classLoader).getURLs();
            int i = 0;
            for (URL urL : urLs) {
                String name = "";
                if (i++ == 0) {
                    name = classLoader.getClass().getSimpleName();
                }
                set.add(new Tuple(name, urL.toString()));
            }
        }
    }
}
