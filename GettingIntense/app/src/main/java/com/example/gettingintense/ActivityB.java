package com.example.gettingintense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    private Intent nextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        nextActivity = new Intent(this, ActivityC.class);
        Button button = (Button) findViewById(R.id.button);
        ButtonClickHandler btnCH = new ButtonClickHandler();
        button.setOnClickListener(btnCH);
    }

    public class ButtonClickHandler implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            startActivity(nextActivity);
        }
    }
}
