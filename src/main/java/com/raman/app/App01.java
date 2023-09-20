package com.raman.app;

import com.raman.characters.CharactersInterface;
import com.raman.characters.SelectCharacter;
import com.raman.characters.Zoro;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = {"com.raman.characters"})
public class App01 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx;
        ctx = new AnnotationConfigApplicationContext(App01.class);

        SelectCharacter obj = ctx.getBean(SelectCharacter.class);
        obj.choose();

        System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));

        ctx.close();
    }
}