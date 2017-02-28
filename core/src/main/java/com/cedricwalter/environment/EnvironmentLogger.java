/*******************************************************************************
 * Copyright 2007 - 2010 Innoveo Solutions AG, Zurich/Switzerland All rights reserved. Use is subject to license terms.
 ******************************************************************************/
package com.cedricwalter.environment;

import com.cedricwalter.environment.plugin.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This file is part of SystemInformation4j.
 * <p>
 * SystemInformation4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * SystemInformation4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with SystemInformation4j.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @copyright cedric.walter
 */
public class EnvironmentLogger {

    private List<String> specificFiles = new ArrayList<String>();

    public static void main(String[] args) {

        EnvironmentLogger environmentLogger = new EnvironmentLogger();

        environmentLogger.trackFilenameLocation("any.txt");
        environmentLogger.trackFilenameLocation("other.txt");

        System.out.println(environmentLogger.getSystemInfo());
    }

    public void trackFilenameLocation(String file) {
        specificFiles.add(file);
    }

    public String getSystemInfo() {
        StringBuffer stringBuffer = new StringBuffer();

        printPluginProperties(stringBuffer, new OshiPlugin());
        printPluginProperties(stringBuffer, new RuntimePlugin());
        printPluginProperties(stringBuffer, new SystemPropertiesPlugin());
        printPluginProperties(stringBuffer, new XMLParserPlugin());
        printPluginProperties(stringBuffer, new SpecificFilesPlugin(specificFiles));
        printPluginProperties(stringBuffer, new ClasspathPlugin());

        return stringBuffer.toString();
    }

    private static void printPluginProperties(StringBuffer buffer, EnvironmentPlugin plugin) {
        if (plugin.getProperties() != null) {
            buffer.append(plugin.getTitle()).append(String.format("%n"));

            Iterator<Tuple> it = plugin.getProperties().iterator();
            while (it.hasNext()) {
                Tuple Tuple = it.next();
                buffer.append(String.format("%-20s %-35s %-1s %-25s %n", "", Tuple.getKey(), "=", Tuple.getValue()));
            }
            buffer.append(String.format("%n"));
        }
    }

}
