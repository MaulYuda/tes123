package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1: {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            } break;

            case R.id.item2: {
                Intent i = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(i);
            } break;

            case R.id.item3: {
                Intent i = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(i);
            } break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menubar, menu);
        return true;
    }
}
