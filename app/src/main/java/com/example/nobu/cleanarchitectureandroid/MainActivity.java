package com.example.nobu.cleanarchitectureandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import usecase.FizzBuzz;

class MainActivity extends AppCompatActivity {

    private FizzBuzz usecase = new FizzBuzz();

    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer input = Integer.parseInt(editText.getText().toString());
                FizzBuzz.Request request = new FizzBuzz.Request(input);
                FizzBuzz.Response response = usecase.execute(request);
                textView.setText(response.getMessage());
            }
        });

    }
}
