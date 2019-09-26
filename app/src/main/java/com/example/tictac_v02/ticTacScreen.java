package com.example.tictac_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ticTacScreen extends AppCompatActivity {
    public boolean player1Turn=true;
    boolean gameover=false;
    int turns=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_screen);



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
        TextView playersTurn = (TextView)findViewById(R.id.playerTurn);


            button1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button)).setText("X");
                        else
                            ((Button) findViewById(R.id.button)).setText("O");

                        player1Turn=!player1Turn;
                        turns++;

                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(player1Turn)
                        ((Button) findViewById(R.id.button2)).setText("X");
                    else
                        ((Button) findViewById(R.id.button2)).setText("O");
                    player1Turn=!player1Turn;
                    turns++;
                }
            });
          button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(player1Turn)
                        ((Button) findViewById(R.id.button3)).setText("X");
                    else
                        ((Button) findViewById(R.id.button3)).setText("O");
                    player1Turn=!player1Turn;
                    turns++;
                }
            });         //row one of game

            button4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (player1Turn)
                        ((Button) findViewById(R.id.button4)).setText("X");
                    else
                        ((Button) findViewById(R.id.button4)).setText("O");
                    player1Turn=!player1Turn;
                    turns++;
                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(player1Turn)
                        ((Button) findViewById(R.id.button5)).setText("X");
                    else
                        ((Button) findViewById(R.id.button5)).setText("O");
                    player1Turn=!player1Turn;
                    turns++;
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(player1Turn)
                        ((Button) findViewById(R.id.button6)).setText("X");
                    else
                        ((Button) findViewById(R.id.button6)).setText("O");
                    player1Turn=!player1Turn;
                    turns++;
                }
            });     //2nd row

            button7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (player1Turn)
                        ((Button) findViewById(R.id.button7)).setText("X");
                    else
                        ((Button) findViewById(R.id.button7)).setText("O");
                    player1Turn=!player1Turn;
                    turns++;
                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(player1Turn)
                        ((Button) findViewById(R.id.button8)).setText("X");
                    else
                        ((Button) findViewById(R.id.button8)).setText("O");
                    player1Turn=!player1Turn;
                    turns++;
                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(player1Turn)
                        ((Button) findViewById(R.id.button9)).setText("X");
                    else
                        ((Button) findViewById(R.id.button9)).setText("O");
                    player1Turn=!player1Turn;
                    turns++;
                }
            });//end of third class







    }
}
