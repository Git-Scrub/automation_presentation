package com.example.dustytrash.ui_testing_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView[] inputFields;
    private TextView[] errorMessageFields;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeFields();
        hideErrorFields();
    }

    private void initializeFields()
    {
        final TextView[] inputFields = {
                (TextView) findViewById(R.id.editText1),
                (TextView) findViewById(R.id.editText2),
                (TextView) findViewById(R.id.editText3)
        };

        final TextView[] errorMessageFields = {
                (TextView) findViewById(R.id.textView1),
                (TextView) findViewById(R.id.textView2),
                (TextView) findViewById(R.id.textView3)
        };

        this.inputFields = inputFields;
        this.errorMessageFields = errorMessageFields;
    }

    private void hideErrorFields()
    {
        for(TextView tv : this.errorMessageFields)
        {
            tv.setVisibility(View.INVISIBLE);
        }
    }
}
