package com.thoughtworks.www.workshopmvvm;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by kleytonsantos on 15/02/18.
 */

public class ViewModelHolder<VM> extends Fragment {

    private VM viewModel;

    public static <VM> ViewModelHolder newInstance(@NonNull VM viewModel) {
        ViewModelHolder<VM> viewModelHolder = new ViewModelHolder<>();
        viewModelHolder.viewModel = viewModel;
        return viewModelHolder;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    public VM getViewModel() {
        return viewModel;
    }

    public void setViewModel(@NonNull VM viewModel) {
        this.viewModel = viewModel;
    }

}
