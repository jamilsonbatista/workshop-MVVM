package com.thoughtworks.www.workshopmvvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by kleytonsantos on 15/02/18.
 */

public class NameProvider {

    private List<String> names;
    private Random random;

    public NameProvider() {
        initNames();
        random = new Random();
    }

    private final void initNames() {
        names = new ArrayList<>();
        names.add("Roberta");
        names.add("Kleyton");
        names.add("Amanda");
        names.add("Filipe");
        names.add("Joana");
        names.add("André");
        names.add("Luciano");
        names.add("Milla");
        names.add("Jorge");
        names.add("Claudia");
    }

    public String getRandomName(){
        return names.get(random.nextInt(names.size()));
    }
}
