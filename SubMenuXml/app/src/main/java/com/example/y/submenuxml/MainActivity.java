package com.example.y.submenuxml;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_textcolor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        tv_textcolor =(TextView) findViewById(R.id.tv_textcolor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_green:{
              tv_textcolor.setTextColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "Green option is selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Green option is selected");
                return true;
            }
            case R.id.item_red:{
                tv_textcolor.setTextColor(Color.RED);
                Toast.makeText(MainActivity.this, "Red option is selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Red option is selected");
                return true;
            }
            case R.id.item_blue:{
                tv_textcolor.setTextColor(Color.BLUE);
                Toast.makeText(MainActivity.this, "Blue option is selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Blue option is selected");
                return true;
            }
            default:return super.onOptionsItemSelected(item);
        }

    }
}
