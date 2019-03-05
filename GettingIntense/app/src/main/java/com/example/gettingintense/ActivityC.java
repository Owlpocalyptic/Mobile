package com.example.gettingintense;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    private Intent nextActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Uri visitHomepage = Uri.parse("https://www.google.com/search?q=owls");
        nextActivity = new Intent(Intent.ACTION_VIEW, visitHomepage);
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
