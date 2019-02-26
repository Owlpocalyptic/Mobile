package com.example.febfridays;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView displayArray =(TextView)findViewById(R.id.baseText);
        displayArray.setText(showArray(R.array.FebFridays));
    }

    public String showArray(int id)
    {
        Resources resourceResolver = getResources();
        int numbers[] = resourceResolver.getIntArray(id);
        String returnString = resourceResolver.getString(R.string.caption_feb);
        for (int i : numbers)
        {
            returnString = returnString.concat(" " + i);
        }
        return returnString;
    }
}
