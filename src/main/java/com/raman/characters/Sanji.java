package com.raman.characters;

import org.springframework.stereotype.Component;

@Component
public class Sanji implements CharactersInterface {
    @Override
    public void run() {
        System.out.println("Sanji Sprint");
    }

    @Override
    public void walk() {
        System.out.println("Sanji Run");
    }

    @Override
    public void fight() {
        System.out.println("Sanji kick");
    }
}
