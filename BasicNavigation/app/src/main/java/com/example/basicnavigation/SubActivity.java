package com.example.basicnavigation;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Resources resourceResolver = getResources();

        Intent launchIntent = getIntent();
        int mode = launchIntent.getIntExtra("itemTitle", R.id.activities);

        ImageView imgView = (ImageView) findViewById(R.id.imageViewSub);
        TextView txtView = (TextView) findViewById(R.id.titleSub);

        String title = "";
        Drawable picture = imgView.getDrawable();
        switch (mode)
        {
            case R.id.activities:
                title = resourceResolver.getString(R.string.activities);
                picture = resourceResolver.getDrawable(R.drawable.activities);
                break;
            case R.id.dining:
                title = resourceResolver.getString(R.string.dining);
                picture = resourceResolver.getDrawable(R.drawable.dining);
                break;
            case R.id.services:
                title = resourceResolver.getString(R.string.services);
                picture = resourceResolver.getDrawable(R.drawable.services);
                break;
            case R.id.shopping:
                title = resourceResolver.getString(R.string.shopping);
                picture = resourceResolver.getDrawable(R.drawable.shopping);
                break;
        }

        imgView.setImageDrawable(picture);
        txtView.setText(title);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Intent activity = new Intent(this, SubActivity.class);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navVew = (NavigationView) findViewById(R.id.nav_view);
        NavigationHandler nvgH = new NavigationHandler();
        nvgH.setVariables(this, activity, drawer);
        navVew.setNavigationItemSelectedListener(nvgH);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}
