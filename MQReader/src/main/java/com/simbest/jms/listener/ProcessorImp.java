package com.simbest.jms.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoxudong_sx
 */
public class ProcessorImp implements Processor{
    private static final Logger LOGGER = LoggerFactory.getLogger(TopicMsgListener.class);

    @Override
    public void process(String msg) {
        LOGGER.info("Received: " + msg);
    }
}
