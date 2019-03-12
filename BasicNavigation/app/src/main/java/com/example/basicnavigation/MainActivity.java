package com.example.basicnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Intent activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = new Intent(this, SubActivity.class);

        Button activityBtn = (Button) findViewById(R.id.activityBtn);
        ButtonClickHandler btnCH = new ButtonClickHandler();
        activityBtn.setOnClickListener(btnCH);
    }

    public class ButtonClickHandler implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            startActivity(activity);
        }
    }
}
