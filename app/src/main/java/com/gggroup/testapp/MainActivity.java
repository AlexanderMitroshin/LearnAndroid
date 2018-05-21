package com.gggroup.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView view;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linerlayout);

        View btn = findViewById(R.id.imageView5);
        btn.setOnClickListener(this);

        View leftBtn = findViewById(R.id.imageView2);
        leftBtn.setOnClickListener(this);

        View rightBtn = findViewById(R.id.imageView);
        rightBtn.setOnClickListener(this);

        View kakhosh = findViewById(R.id.button22);
        kakhosh.setOnClickListener(this);

        View rightbBtn = findViewById(R.id.imageView6);
        rightbBtn.setOnClickListener(this);

        view = (TextView) findViewById(R.id.tview);

       final CheckBox checkbox =(CheckBox) findViewById(R.id.checkBox);
       checkbox.setChecked(true);
       checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (isChecked){
                   view.setText("active");
               }else {
                   view.setText("noActive");
               }
           }
       });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageView2:
                Toast.makeText(MainActivity.this, "privet ya levaya knopka", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView:
                Toast.makeText(MainActivity.this, "privet ya pravay knopka", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button22:
                Toast.makeText(MainActivity.this, "ololo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageView6:
                view.setText("Privet");
                break;
            case R.id.imageView5:
                Intent next = new Intent(this,SecondActivity.class);
                startActivity(next);
                break;

        }
    }
}
