package org.sample.drools.helper;

import org.drools.core.spi.KnowledgeHelper;
import org.slf4j.LoggerFactory;


/**
 * Functions for use in DRL files.
 */
public class RuleFunctions {
    //static final Logger logger = LoggerFactory.getLogger(RuleFunctions.class);
    /**
     * Log a debug message from a rule, using the rule’s package and name as the Log4J
     * category.
     */
    public static void log(final KnowledgeHelper drools, final String message,final Object... parameters) 
    {
        final String category = drools.getRule().getPackageName() + "." + drools.getRule().getName();
        final String formattedMessage = String.format(message, parameters);
        LoggerFactory.getLogger(category).debug(formattedMessage);
    }
    
}
