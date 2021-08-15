package com.example.news_by_mayank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    public void itifin(View view) {
        Intent intent=new Intent(MainActivity.this,tifinM.class);
        Log.e("tag","llalala");
        startActivity(intent);

    }

    public void ihospital(View view) {
        Intent intent=new Intent(MainActivity.this,tifinM.class);
        Log.e("tag","llalala");
        startActivity(intent);

    }

    public void ifuneralcar(View view) {
        Intent intent=new Intent(MainActivity.this,tifinM.class);
        Log.e("tag","llalala");
        startActivity(intent);
    }

    public void imadicines(View view) {
        Intent intent=new Intent(MainActivity.this,tifinM.class);
        Log.e("tag","llalala");
        startActivity(intent);

    }

    public void logout(View view) {
        Intent intent=new Intent(MainActivity.this,tifinM.class);
        Log.e("tag","llalala");
        startActivity(intent);

    }

    public void toolmenu(View view) {
        Intent intent=new Intent(MainActivity.this,tifinM.class);
        Log.e("tag","llalala");
        startActivity(intent);

    }

    public void islot(View view) {
        Intent intent=new Intent(MainActivity.this,tifinM.class);
        Log.e("tag","llalala");
        startActivity(intent);
    }

    public void other(View view) {
        Intent intent=new Intent(MainActivity.this,tifinM.class);
        Log.e("tag","llalala");
        startActivity(intent);
    }
}