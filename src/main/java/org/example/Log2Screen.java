package org.example;

import org.apache.log4j.Logger;

public class Log2Screen implements Log{
    private static final Logger logger = Logger.getLogger(Log2Screen.class);
    @Override
    public void Write() {
        logger.info("Screen");
    }
}
