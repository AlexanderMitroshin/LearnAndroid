package com.gggroup.testapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by gabber on 24.05.18.
 */

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.my_menu, menu);
        menu.add(1,1,0,R.string.menu1);
        menu.add(1,2,2,R.string.menu2);
        menu.add(1,3,1,R.string.menu3);
        menu.add(1,4,3,R.string.menu4);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()){
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
