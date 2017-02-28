package com.cedricwalter.environment.plugin;

import com.cedricwalter.environment.Tuple;

import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SpecificFilesPlugin implements EnvironmentPlugin {

    private List<String> specificFiles;

    public SpecificFilesPlugin(List<String> specificFiles) {
        this.specificFiles = specificFiles;
    }

    public Set<Tuple> getProperties() {
        Set<Tuple> set = new TreeSet();

        for (String file : specificFiles) {
            if (file != null) {
                URL resource = getClass().getResource("/" + file);
                if (resource != null) {
                    set.add(new Tuple(file + " location", resource.toString()));
                } else {
                    set.add(new Tuple(file + " location", "not found in classpath."));
                }
            }
        }

        return set;
    }

    public String getTitle() {
        return "Specific files";
    }

}
