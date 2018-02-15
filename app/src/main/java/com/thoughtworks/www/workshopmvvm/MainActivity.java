package com.thoughtworks.www.workshopmvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private List<String> names;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNames();
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.button);
        random = new Random();

        textView.setText(getRandomName());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getRandomName());
            }
        });
    }

    private String getRandomName() {
        return names.get(random.nextInt(names.size()));
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
}

