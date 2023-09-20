package com.raman.characters;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Luffy implements CharactersInterface {
    @Override
    public void run() {
        System.out.println("Gum Gum no run");
    }

    @Override
    public void walk() {
        System.out.println("Gum Gum no walk");
    }

    @Override
    public void fight() {
        System.out.println("Gum gum no bazooka");
    }
}
