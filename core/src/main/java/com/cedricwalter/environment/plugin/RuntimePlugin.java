package com.cedricwalter.environment.plugin;

import com.cedricwalter.environment.Tuple;

import java.util.Set;
import java.util.TreeSet;

public class RuntimePlugin implements EnvironmentPlugin {

    public static int MEGA_BYTES = 1024 * 1024;

    public Set<Tuple> getProperties() {
        Set<Tuple> set = new TreeSet();

        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();

        set.add(new Tuple("Total memory (MB)", Long.toString(runtime.totalMemory() / MEGA_BYTES)));
        set.add(new Tuple("Free memory (MB)", Long.toString(runtime.freeMemory() / MEGA_BYTES)));
        set.add(new Tuple("Used memory (MB)", Long.toString((runtime.totalMemory() - runtime.freeMemory()) / MEGA_BYTES)));
        set.add(new Tuple("Max memory (MB)", Long.toString(runtime.maxMemory() / MEGA_BYTES)));

        return set;
    }

    public String getTitle() {
        return "Java Runtime";
    }

}
