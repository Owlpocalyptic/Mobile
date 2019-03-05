package com.example.musiclessons;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Populating the dropdown box for the months
        Spinner monthSpinner = (Spinner)findViewById(R.id.monthSpinner);
        int layoutID = android.R.layout.simple_spinner_item;
        Resources resourceResolver = getResources();
        String months[] = resourceResolver.getStringArray(R.array.months);
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<String>(this, layoutID, months);
        monthSpinner.setAdapter(monthAdapter);

        Button enrolButton = (Button) findViewById(R.id.buttonEnrol);
        ButtonClickHandler handler = new ButtonClickHandler();
        enrolButton.setOnClickListener(handler);
    }

    public class ButtonClickHandler implements View.OnClickListener
    {
        @Override
        public void onClick(View v)
        {
            RadioGroup instruments = (RadioGroup)findViewById(R.id.radioButtons);
            Resources resourceResolver = getResources();
            String congratsMessage = resourceResolver.getString(R.string.congratulations);
            RadioButton selectedRBTN = (RadioButton)findViewById(instruments.getCheckedRadioButtonId());
            congratsMessage = congratsMessage.replace(resourceResolver.getString(R.string.congratulationsI), selectedRBTN.getText());

            Spinner monthSpinner = (Spinner)findViewById(R.id.monthSpinner);
            congratsMessage = congratsMessage.replace(resourceResolver.getString(R.string.congratulationsM), monthSpinner.getSelectedItem().toString());

            TextView congratsText = (TextView)findViewById(R.id.congratsText);

            congratsText.setText(congratsMessage);
        }
    }
}
