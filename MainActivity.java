package com.example.user.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        Toast.makeText(this,"Let's begin !", Toast.LENGTH_SHORT).show();
        Intent x=new Intent(this, Main2Activity.class);
        startActivity(x);
    }
}
