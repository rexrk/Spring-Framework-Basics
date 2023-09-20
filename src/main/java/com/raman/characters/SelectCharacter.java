package com.raman.characters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SelectCharacter {
    @Autowired @Qualifier("sanji")
    private final CharactersInterface charactersInterface;

    public SelectCharacter(CharactersInterface charactersInterface) {
        this.charactersInterface = charactersInterface;
    }

    public void choose() {
        System.out.println("Chosen : " + charactersInterface.getClass().getSimpleName());
        charactersInterface.walk();
        charactersInterface.run();
        charactersInterface.fight();
    }
}