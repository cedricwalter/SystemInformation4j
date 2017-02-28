package com.cedricwalter.environment;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
public class EnvironmentListener  implements ServletContextListener {

    private Logger log = LoggerFactory.getLogger(EnvironmentLogger.class);

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        EnvironmentLogger environmentLogger = new EnvironmentLogger();

        String specificFiles = servletContextEvent.getServletContext().getInitParameter("specificFiles");
        String[] files = specificFiles.split(",");
        for (String file : files) {
            environmentLogger.trackFilenameLocation(file);
        }

        log.info(environmentLogger.getSystemInfo());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
