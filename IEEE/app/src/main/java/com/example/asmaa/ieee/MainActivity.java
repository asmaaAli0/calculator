package com.example.asmaa.ieee;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String str2 = "", str = "", sign = "", tot = "";
    public double a, b, count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        Button button = (Button) v;
        str = button.getText().toString();
        tot += str;
        EditText edit = (EditText) findViewById(R.id.editText3);
        edit.setText(tot);
    }

    public void onClickSigns(View v) {
        a = Double.parseDouble(tot);
        tot = "";
        Button button = (Button) v;
        str = (button).getText().toString();
        sign = str;
        EditText edit = (EditText) findViewById(R.id.editText3);
        edit.setText("");

    }

    public void calculate(View v) {
        EditText edit = (EditText) findViewById(R.id.editText3);
        str2 = edit.getText().toString();
        b = Double.parseDouble(str2);

        if (sign.equals("+")) {
            count = a + b;
        } else if (sign.equals("-")) {
            count = a - b;
        } else if (sign.equals("*")) {
            count = a * b;
        } else if (sign.equals("/")) {
            count = a / b;
        }
        edit.setText(String.valueOf(count));

    }

    public void delete(View v) {
        EditText edit = (EditText) findViewById(R.id.editText3);
        edit.setText("");
        tot = "";

    }

    public void show(View v) {

    }
}

