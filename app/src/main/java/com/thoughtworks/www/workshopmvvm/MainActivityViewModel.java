package com.thoughtworks.www.workshopmvvm;

import android.databinding.ObservableField;

/**
 * Created by kleytonsantos on 15/02/18.
 */

public class MainActivityViewModel {

    public final ObservableField<String> name = new ObservableField<>();

    private final NameProvider nameProvider;

    public MainActivityViewModel(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }

    public void updateName(){
        name.set(nameProvider.getRandomName());
    }
}
