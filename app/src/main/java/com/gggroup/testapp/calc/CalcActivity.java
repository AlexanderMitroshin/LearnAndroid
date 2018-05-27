package com.gggroup.testapp.calc;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.gggroup.testapp.R;

/**
 * Created by gabber on 27.05.18.
 */

public class CalcActivity extends Activity implements View.OnClickListener {

    private Button btnAdd;
    private Button btnSub;
    private Button btnDiv;
    private Button btnMult;
    private EditText etNum1;
    private EditText etNum2;
    private TextView tvresult;
    private String oper = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMult = findViewById(R.id.btnMult);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        tvresult = findViewById(R.id.tvResult);


    }


    @Override
    public void onClick(View v) {

        float num1 = 0;
        float num2 = 0;
        float result = 0;
        if (TextUtils.isEmpty(etNum1.getText()) || TextUtils.isEmpty(etNum2.getText())) {
            return;
        }
        num1 = Float.parseFloat(etNum1.getText().toString());
        num2 = Float.parseFloat(etNum2.getText().toString());


        switch (v.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
        }

        tvresult.setText(num1 + " " + oper+" " + num2 + " = " + result);

    }
}
