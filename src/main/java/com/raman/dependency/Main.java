package com.raman.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass {
    Dependency1 dependency1;
    Dependency2 dependency2;
    public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Spring was Here");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "Dependencies : " + dependency1 + " and "
                + dependency2;
    }
}
@Component
class Dependency1 { }
@Component
class Dependency2 { }

@ComponentScan
@Configuration
public class Main {
    public static void main(String[] raman) {
        AnnotationConfigApplicationContext ctx;
        ctx = new AnnotationConfigApplicationContext(Main.class);


        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
        System.out.println(ctx.getBean(BusinessClass.class));
        ctx.close();
    }
}
