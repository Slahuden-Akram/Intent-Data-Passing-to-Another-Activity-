package com.ruler.intent_datapassing;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String s = getIntent().getStringExtra("aaa");
        Integer tag = getIntent().getIntExtra("tag", 0);
        TextView t = (TextView) findViewById(R.id.textView);
        t.setText(s.toString() + tag.toString());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home)
        {
            Intent intent= new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);

    }
}
