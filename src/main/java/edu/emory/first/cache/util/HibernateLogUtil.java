package edu.emory.first.cache.util;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Helps with debugging.  Can be used to turn on different aspects of hibernate logging. See the link below for more categories and descriptions
 *
 * http://docs.jboss.org/hibernate/orm/4.3/topical/html/logging/Logging.html
 *
 */
public final class HibernateLogUtil {
    public static void turnOnAll() {
        turnOnSqlLogging();
        turnOnJdbcLogging();
        turnOnTransactionLogging();
    }

    public static void turnOffAll() {
        turnOffSqlLogging();
        turnOffJdbcLogging();
        turnOffTransactionLogging();
    }

    public static void turnOnSqlLogging() {
        Logger.getLogger("org.hibernate.SQL").setLevel(Level.DEBUG);
    }

    public static void turnOffSqlLogging() {
        LogManager.getLogger("org.hibernate.SQL").setLevel(Level.INFO);
    }

    public static void turnOnJdbcLogging() {
        LogManager.getLogger("org.hibernate.jdbc").setLevel(Level.DEBUG);
    }

    public static void turnOffJdbcLogging() {
        LogManager.getLogger("org.hibernate.jdbc").setLevel(Level.INFO);
    }

    public static void turnOnTransactionLogging() {
        LogManager.getLogger("org.hibernate.transaction").setLevel(Level.DEBUG);
    }

    public static void turnOffTransactionLogging() {
        LogManager.getLogger("org.hibernate.transaction").setLevel(Level.INFO);
    }

}
