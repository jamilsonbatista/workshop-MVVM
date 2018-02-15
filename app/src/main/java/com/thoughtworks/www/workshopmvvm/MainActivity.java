package com.thoughtworks.www.workshopmvvm;

import android.databinding.DataBindingUtil;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thoughtworks.www.workshopmvvm.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    public static final String VIEW_MODEL = "VIEW_MODEL";
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewModel = getViewModel();
        binding.setViewModel(viewModel);
    }


    private MainActivityViewModel getViewModel() {

        ViewModelHolder<MainActivityViewModel> holder = (ViewModelHolder<MainActivityViewModel>) getSupportFragmentManager().findFragmentByTag(VIEW_MODEL);
        if (!(holder != null && holder.getViewModel() != null)) {
            MainActivityViewModel viewModel = new MainActivityViewModel(new NameProvider());
            holder = ViewModelHolder.newInstance(viewModel);
            getSupportFragmentManager().beginTransaction().add(holder, VIEW_MODEL).commit();
        }

        return holder.getViewModel();

    }


}

