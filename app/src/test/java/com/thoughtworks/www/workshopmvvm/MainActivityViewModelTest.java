package com.thoughtworks.www.workshopmvvm;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityViewModelTest {

    @Test
    public void expected_change_name() throws Exception {
        NameProvider nameProvider = mock(NameProvider.class);
        when(nameProvider.getRandomName()).thenReturn("Kleyton");
        MainActivityViewModel viewModel = new MainActivityViewModel(nameProvider);
        assertEquals("Kleyton", viewModel.name.get());
    }



}