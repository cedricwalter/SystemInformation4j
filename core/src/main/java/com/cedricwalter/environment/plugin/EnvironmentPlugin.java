package com.cedricwalter.environment.plugin;

import com.cedricwalter.environment.Tuple;

import java.util.Set;

public interface EnvironmentPlugin {

    Set<Tuple> getProperties();

    String getTitle();

}
