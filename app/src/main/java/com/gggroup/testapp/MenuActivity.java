package com.gggroup.testapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gabber on 24.05.18.
 */

public class MenuActivity extends AppCompatActivity {


    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_GREEN = 2;
    final int MENU_COLOR_BLUE = 3;

    final int MENU_SIZE_22 = 4;
    final int MENU_SIZE_26 = 5;
    final int MENU_SIZE_30 = 6;

    private TextView tvColor;
    private TextView tvSize;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson13);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        tvColor = (TextView) findViewById(R.id.tvColor);
        tvSize = (TextView) findViewById(R.id.tvSize);


        registerForContextMenu(tvColor);
        registerForContextMenu(tvSize);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);


        switch (v.getId()) {
            case R.id.tvColor:
                menu.add(0, MENU_COLOR_RED, 0, "Red");
                menu.add(0, MENU_COLOR_GREEN, 0, "Green");
                menu.add(0, MENU_COLOR_BLUE, 0, "Blue");
                break;
            case R.id.tvSize:
                menu.add(0, MENU_SIZE_22, 0, "22");
                menu.add(0, MENU_SIZE_26, 0, "26");
                menu.add(0, MENU_SIZE_30, 0, "30");
                break;
        }
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_COLOR_RED:
                tvColor.setTextColor(Color.RED);
                tvColor.setText("Text color = red");
                break;
            case MENU_COLOR_GREEN:
                tvColor.setTextColor(Color.GREEN);
                tvColor.setText("Text color = green");
                break;
            case MENU_COLOR_BLUE:
                tvColor.setTextColor(Color.BLUE);
                tvColor.setText("Text color = blue");
                break;
// пункты меню для tvSize
            case MENU_SIZE_22:
                tvSize.setTextSize(22);
                tvSize.setText("Text size = 22");
                break;
            case MENU_SIZE_26:
                tvSize.setTextSize(26);
                tvSize.setText("Text size = 26");
                break;
            case MENU_SIZE_30:
                tvSize.setTextSize(30);
                tvSize.setText("Text size = 30");
                break;
        }
        return super.onContextItemSelected(item);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.my_menu, menu);
        menu.add(1, 1, 0, R.string.menu1);
        menu.add(1, 2, 2, R.string.menu2);
        menu.add(1, 3, 1, R.string.menu3);
        menu.add(1, 4, 3, R.string.menu4);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
          case 1:
              Toast.makeText(this,"click on menu 1",Toast.LENGTH_SHORT).show();
              break;
          case 2:
              Toast.makeText(this,"click on menu 2",Toast.LENGTH_SHORT).show();
              break;
          case 3:
              Toast.makeText(this,"click on menu 3",Toast.LENGTH_SHORT).show();
              break;
          case 4:
              Toast.makeText(this,"click on menu 4",Toast.LENGTH_SHORT).show();
              break;

        }


        return super.onOptionsItemSelected(item);
    }

}
