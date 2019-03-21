package com.order.management.productsservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(CommandLineAppStartupRunner.class);
    @Autowired
    ProductDao productDao;
    @Override
    public void run(String...args) throws Exception {
    	productDao.save(new Product("Samsung S10", 50000.00 ));
    	productDao.save(new Product("Iphone 10", 100000.00 ));
    }
}