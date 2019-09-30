package com.example.tictac_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class ticTacScreen extends AppCompatActivity {
    public boolean player1Turn=true;
    boolean gameover=false;

    Button button1, button2, button3,button4,button5,button6,button7,button8,button9;


    int turns=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_screen);

        Button resetButton = (Button) findViewById(R.id.reset);
        button1= (Button) findViewById(R.id.button);
         button2 = (Button) findViewById(R.id.button2);
         button3 = (Button) findViewById(R.id.button3);//first row

         button4 = (Button) findViewById(R.id.button4);
         button5 = (Button) findViewById(R.id.button5);
         button6 = (Button) findViewById(R.id.button6);//second row

         button7 = (Button) findViewById(R.id.button7);
         button8 = (Button) findViewById(R.id.button8);
         button9 = (Button) findViewById(R.id.button9);//third row



        TextView playersTurn = (TextView)findViewById(R.id.playerTurn);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent myIntent = new Intent(ticTacScreen.this,
                        MainActivity.class);
                startActivity(myIntent);

            }
        });//end of click listener

            button1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(((Button) findViewById(R.id.button)).getText()=="") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button)).setText("X");
                        else
                            ((Button) findViewById(R.id.button)).setText("O");

                        player1Turn = !player1Turn;
                        turns++;
                        checkWin();
                    }

                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(((Button) findViewById(R.id.button2)).getText()=="") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button2)).setText("X");
                        else
                            ((Button) findViewById(R.id.button2)).setText("O");

                        player1Turn = !player1Turn;
                        turns++;
                        checkWin();
                    }
                }
            });
          button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(((Button) findViewById(R.id.button3)).getText()=="") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button3)).setText("X");
                        else
                            ((Button) findViewById(R.id.button3)).setText("O");

                        player1Turn = !player1Turn;
                        turns++;
                        checkWin();
                    }
                }
            });         //row one of game

            button4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(((Button) findViewById(R.id.button4)).getText()=="") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button4)).setText("X");
                        else
                            ((Button) findViewById(R.id.button4)).setText("O");

                        player1Turn = !player1Turn;
                        turns++;
                        checkWin();
                    }
                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((Button) findViewById(R.id.button5)).getText() == "") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button5)).setText("X");
                        else
                            ((Button) findViewById(R.id.button5)).setText("O");

                        player1Turn = !player1Turn;
                        turns++;
                        checkWin();
                    }
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(((Button) findViewById(R.id.button6)).getText()=="") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button6)).setText("X");
                        else
                            ((Button) findViewById(R.id.button6)).setText("O");

                        player1Turn = !player1Turn;
                        turns++;
                        checkWin();
                    }
                }
            });     //2nd row

            button7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (((Button) findViewById(R.id.button7)).getText() == "") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button7)).setText("X");
                        else
                            ((Button) findViewById(R.id.button7)).setText("O");

                    player1Turn = !player1Turn;
                    turns++;
                        checkWin();
                }
                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(((Button) findViewById(R.id.button8)).getText()=="") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button8)).setText("X");
                        else
                            ((Button) findViewById(R.id.button8)).setText("O");

                        player1Turn = !player1Turn;
                        turns++;
                        checkWin();
                    }
                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if(((Button) findViewById(R.id.button9)).getText()=="") {
                        if (player1Turn)
                            ((Button) findViewById(R.id.button9)).setText("X");
                        else
                            ((Button) findViewById(R.id.button9)).setText("O");
                        player1Turn = !player1Turn;
                        turns++;
                        checkWin();
                    }

                }
            });//end of third class

    }

    public void checkWin()
    {
        Button ticTacButtons[] = {button1, button2, button3,button4,button5,button6,button7,button8,button9};
        if((ticTacButtons[0].getText()==ticTacButtons[1].getText())&&(ticTacButtons[0].getText()==ticTacButtons[2].getText()))
        {
            if(ticTacButtons[0].getText()=="X")
                Toast.makeText(this, "Player 1", Toast.LENGTH_LONG).show();
            if(ticTacButtons[0].getText()=="O")
                Toast.makeText(this, "Player 2", Toast.LENGTH_LONG).show();
        }

        if((ticTacButtons[0].getText()==ticTacButtons[4].getText())&&(ticTacButtons[0].getText()==ticTacButtons[8].getText()))
        {
            if(ticTacButtons[0].getText()=="X")
                Toast.makeText(this, "Player 1", Toast.LENGTH_LONG).show();
            if(ticTacButtons[0].getText()=="O")
                Toast.makeText(this, "Player 2", Toast.LENGTH_LONG).show();
        }

        if((ticTacButtons[0].getText()==ticTacButtons[3].getText())&&(ticTacButtons[0].getText()==ticTacButtons[6].getText()))
        {
            if(ticTacButtons[0].getText()=="X")
                Toast.makeText(this, "Player 1", Toast.LENGTH_LONG).show();
            if(ticTacButtons[0].getText()=="O")
                Toast.makeText(this, "Player 2", Toast.LENGTH_LONG).show();
        }

        if((ticTacButtons[3].getText()==ticTacButtons[4].getText())&&(ticTacButtons[3].getText()==ticTacButtons[5].getText()))
        {
            if(ticTacButtons[3].getText()=="X")
                Toast.makeText(this, "Player 1", Toast.LENGTH_LONG).show();
            if(ticTacButtons[3].getText()=="O")
                Toast.makeText(this, "Player 2", Toast.LENGTH_LONG).show();
        }

        if((ticTacButtons[6].getText()==ticTacButtons[7].getText())&&(ticTacButtons[6].getText()==ticTacButtons[5].getText()))
        {
            if(ticTacButtons[6].getText()=="X")
                Toast.makeText(this, "Player 1", Toast.LENGTH_LONG).show();
            if(ticTacButtons[6].getText()=="O")
                Toast.makeText(this, "Player 2", Toast.LENGTH_LONG).show();
        }

        if((ticTacButtons[2].getText()==ticTacButtons[5].getText())&&(ticTacButtons[2].getText()==ticTacButtons[8].getText()))
        {
            if(ticTacButtons[2].getText()=="X")
                Toast.makeText(this, "Player 1", Toast.LENGTH_LONG).show();
            if(ticTacButtons[2].getText()=="O")
                Toast.makeText(this, "Player 2", Toast.LENGTH_LONG).show();
        }

        if((ticTacButtons[1].getText()==ticTacButtons[4].getText())&&(ticTacButtons[1].getText()==ticTacButtons[7].getText()))
        {
            if(ticTacButtons[1].getText()=="X")
                Toast.makeText(this, "Player 1", Toast.LENGTH_LONG).show();
            if(ticTacButtons[1].getText()=="O")
                Toast.makeText(this, "Player 2", Toast.LENGTH_LONG).show();
        }

        if((ticTacButtons[2].getText()==ticTacButtons[4].getText())&&(ticTacButtons[2].getText()==ticTacButtons[6].getText()))
        {
            if(ticTacButtons[2].getText()=="X")
                Toast.makeText(this, "Player 1", Toast.LENGTH_LONG).show();
            if(ticTacButtons[2].getText()=="O")
                Toast.makeText(this, "Player 2", Toast.LENGTH_LONG).show();
        }
    }
}
