package com.example.takehome06dongqingy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        this.setTitle("Your Receipt");
        TextView textView=(TextView)findViewById(R.id.text);
        Intent intent=getIntent();

       String str=intent.getStringExtra("Key_String");
       textView.setText(str);

    }
}
