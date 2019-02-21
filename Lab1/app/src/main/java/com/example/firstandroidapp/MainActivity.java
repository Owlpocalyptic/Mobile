package com.example.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textRandomString = (TextView)findViewById(R.id.textDisplay);
        textRandomString.setText(randomString());
    }

    public String randomString()
    {
        Random random = new Random();
        int index = random.nextInt(4);
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Poodle");
        strings.add("Labrador");
        strings.add("Shar Pei");
        strings.add("Newfoundland");
        return strings.get(index);
    }
}
