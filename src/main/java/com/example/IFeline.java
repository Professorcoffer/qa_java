package com.example;

import java.util.List;

public interface IFeline extends Predator {
    int getKittens();

    int getKittens(int count);

    public List<String> getFood(String animalKind) throws Exception;
}
