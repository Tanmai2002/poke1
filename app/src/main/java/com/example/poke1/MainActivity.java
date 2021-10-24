package com.example.poke1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String msg="com.example.poke1.msg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void butCLicked(View view){
        Intent i=new Intent(this,display.class);
        i.putExtra(msg,((EditText)findViewById(R.id.editTextTextPersonName)).getText().toString());
        startActivity(i);
    }
}