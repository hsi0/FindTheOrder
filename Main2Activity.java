package com.example.user.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
 Button[] butoane=new Button[4];
    int pas=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        butoane[0]=(Button)findViewById(R.id.button1);
        butoane[1]=(Button)findViewById(R.id.button2);
        butoane[2]=(Button)findViewById(R.id.button3);
        butoane[3]=(Button)findViewById(R.id.button4);



        List<Button> mylist= Arrays.asList(butoane);
        Collections.shuffle(mylist);
        butoane=mylist.toArray(butoane);

        for(int i=0;i<4;i++){
            butoane[i].setText(""+(i+1));
        }

    }
    public void startjoc(View view){
        for(int i=0;i<4;i++)
        {
            butoane[i].setText("");
        }

    }
    public void butonapasat(View view){
        Button b=(Button )view;
        if(butoane[pas]==b){
            pas++;
            b.setText(""+pas);
            if(pas==4)
            {
                Toast.makeText(this,"GJ !", Toast.LENGTH_LONG).show();
                finish();}
            }else{
                Toast.makeText(this,"Try again:)", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

