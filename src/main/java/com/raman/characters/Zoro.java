package com.raman.characters;

import org.springframework.stereotype.Component;

@Component
public class Zoro implements CharactersInterface {

    @Override
    public void run() {
        System.out.println("Zoro Running");
    }

    @Override
    public void walk() {
        System.out.println("Zoro Walking");
    }

    @Override
    public void fight() {
        System.out.println("zoro oni-giri");
    }
}
