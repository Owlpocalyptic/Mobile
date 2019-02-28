package com.example.musiclessons;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner instrumentSpinner = (Spinner)findViewById(R.id.instrumentSpinner);
        int layoutID = android.R.layout.simple_spinner_item;
        Resources resourceResolver = getResources();
        String months[] = resourceResolver.getStringArray(R.array.months);
        ArrayAdapter<String> instrumentAdapter = new ArrayAdapter<String>(this, layoutID, months);
        instrumentSpinner.setAdapter(instrumentAdapter);
    }
}
