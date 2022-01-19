package com.example.button4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn4 ;
    int mone = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn4 = findViewById(R.id.btn4) ;
    }

    public void go(View view) {
        mone++;
        btn4.setText("This is a click number:"+ mone );
        if(mone%7==0 )
            btn4.setText ("BOOM") ;

    }
}