package com.example.eventhandling;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.mainButton);
        button.setBackgroundColor(randomColor());
        ButtonClickHandler handler = new ButtonClickHandler();
        ButtonLongClickHandler handlerLong = new ButtonLongClickHandler();

        button.setOnClickListener(handler);
        button.setOnLongClickListener(handlerLong);
    }

    public int randomColor()
    {
        Random random = new Random();
        Resources resourceResolver = getResources();
        int numbers[] = resourceResolver.getIntArray(R.array.buttonColors);

        return numbers[random.nextInt(numbers.length)];
    }

    public class ButtonClickHandler implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            v.setBackgroundColor(randomColor());
        }
    }

    public class ButtonLongClickHandler implements View.OnLongClickListener
    {
        @Override
        public boolean onLongClick(View v)
        {
            Toast longPress = Toast.makeText(MainActivity.this, "TOO LONG!", Toast.LENGTH_SHORT);
            longPress.show();
            return true;
        }
    }
}
