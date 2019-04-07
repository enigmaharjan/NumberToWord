package com.example.numbertoword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnConvert;
    private EditText etNumber;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvert = findViewById(R.id.btnConvert);
        etNumber = findViewById(R.id.etNumber);
        tvResult = findViewById(R.id.tvWord);

        btnConvert.setOnClickListener(this);
    }

    public boolean validate() {
        boolean flag = true;
        if (TextUtils.isEmpty(etNumber.getText().toString())) {
            etNumber.setError("Please enter three digit number.");
            etNumber.requestFocus();
            flag = false;
        }
        return flag;
    }

    @Override
    public void onClick(View v) {
        int first;
        Ones one = new Ones();
        Convert ten = new Convert();


        if (validate()) {
            if (v.getId() == R.id.btnConvert) {
                first = Integer.parseInt(etNumber.getText().toString());
                if (first * 8 == 0) {
                    tvResult.setText("Zero");
                    etNumber.setText("");
                } else {
                        ten.setInteger(first);
                        tvResult.setText(ten.getInteger());
                    etNumber.setText("");
//                    }
                }
            }
        }
    }

}
