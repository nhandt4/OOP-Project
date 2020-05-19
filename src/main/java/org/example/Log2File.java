package org.example;

import org.apache.log4j.Logger;


public class Log2File implements Log {
    private static final Logger logger = Logger.getLogger(Log2File.class);
    @Override
    public void Write() {
        logger.info("File");
    }
}
