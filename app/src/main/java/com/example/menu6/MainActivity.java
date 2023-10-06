package com.example.menu6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
    public boolean onCreateOptionsMenu(Menu menu) {

            getMenuInflater().inflate(R.menu.menu,menu);

            return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int i = item.getItemId();

            if(i== R.id.i1) {

                Toast.makeText(getApplicationContext(), "item1 selected", Toast.LENGTH_SHORT).show();
                return true;
            }else if(i== R.id.item2) {
                Toast.makeText(getApplicationContext(), "item2 selected", Toast.LENGTH_SHORT).show();
                return true;

            }else if(i == R.id.item3){
                Toast.makeText(getApplicationContext(), "item3 selected", Toast.LENGTH_SHORT).show();
                return true;

            }


        return super.onOptionsItemSelected(item);
    }
}