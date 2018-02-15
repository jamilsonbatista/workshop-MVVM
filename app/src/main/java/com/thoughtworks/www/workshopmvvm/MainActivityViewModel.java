package com.thoughtworks.www.workshopmvvm;

import android.databinding.ObservableField;

/**
 * Created by kleytonsantos on 15/02/18.
 */

public class MainActivityViewModel {

    public final ObservableField<String> name;
    private final NameProvider nameProvider;

    public MainActivityViewModel(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
        name = new ObservableField<>();
        updateName();
    }

    public void updateName() {
        name.set(nameProvider.getRandomName());
    }
}
