package com.raman.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BusinessCalculationService {
    private final DataService dataService;
    @Autowired
    public BusinessCalculationService(@Qualifier("mongoDbDataService") DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(-1);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx;
        ctx = new AnnotationConfigApplicationContext(BusinessCalculationService.class);
        var val = ctx.getBean(BusinessCalculationService.class).findMax();
        System.out.println("Max in DB: " + val);
        ctx.close();
    }
}
