package org.example;

import org.apache.log4j.Logger;

public class Log2Email implements Log{
    private static final Logger logger = Logger.getLogger(Log2Email.class);
    @Override
    public void Write() {
        logger.info("Email");
    }
}
