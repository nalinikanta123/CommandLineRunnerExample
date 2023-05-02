package com.dreamthoughts.CommandLineRunnerExample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=1)
@Component
class BeanThree implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());
 
    @Override
    public void run(String... args) throws Exception {
        System.out.println("BeanThree run method Started !!");
    }
}
