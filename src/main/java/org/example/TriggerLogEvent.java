package org.example;

import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.TriggeringEventEvaluator;


public class TriggerLogEvent implements TriggeringEventEvaluator {

    private volatile int num = 1;

    private int quotient = 1;

    @Override
    public boolean isTriggeringEvent(LoggingEvent event) {
        return num++ % quotient == 0;
    }

    public void setQuotient(int quotient) {
        this.quotient = quotient;
    }
}