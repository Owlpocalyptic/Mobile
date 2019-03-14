package com.example.basicnavigation;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent activity = new Intent(this, SubActivity.class);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navVew = (NavigationView) findViewById(R.id.nav_view);
        NavigationHandler nvgH = new NavigationHandler();
        nvgH.setVariables(this, activity, drawer);
        navVew.setNavigationItemSelectedListener(nvgH);
    }
}
