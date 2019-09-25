package com.example.tictac_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ticTacScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_screen);

        final boolean player1Turn=true;

        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);//first row

        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);//second row

        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);//third row

        Button ticTacButtons[] = {button1, button2, button3,button4,button5,button6,button7,button8,button9};

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(player1Turn)
                    ((Button) findViewById(R.id.button)).setText("X");
                else
                    ((Button) findViewById(R.id.button)).setText("O");
            }
        });




    }
}
