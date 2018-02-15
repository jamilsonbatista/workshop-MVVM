package com.thoughtworks.www.workshopmvvm;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by kleytonsantos on 15/02/18.
 */

public class NameProviderTest {

    private List<String> names;

    @Before
    public void init(){
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
    }

    @Test
    public void expected_name(){
        NameProvider nameProvider = new NameProvider();
        String result = nameProvider.getRandomName();
        Assert.assertTrue(names.contains(result));
    }



}
