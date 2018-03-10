package edu.css.amanda.cis3334_midtermexam_nicholsamanda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etEnterName;
    TextView tvDisplayName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEnterName   = (EditText) findViewById(R.id.editTextName);
        tvDisplayName = (TextView) findViewById(R.id.textViewDisplayName);

    }

    public void buttonPushMeClick(View view) {
        String name = etEnterName.getText().toString();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);

        tvDisplayName.setText(name + " is a great Android programmer!");
    }
}
