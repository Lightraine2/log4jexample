package com.log4jexample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sun.tools.javac.Main;

/*
 *
 * Log4j vuln test application
 *
 * Versions Affected: all versions from 2.0-beta9 through 2.12.1 and 2.13.0 through 2.14.1
 */

public class App
{
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main( String[] args )
    {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        String executionCommand = args[0];
        logger.error("Parsing string: " + executionCommand);

    }
}