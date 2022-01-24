package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class twoplayer_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoplayer_screen);
    }

        static void check(int[] board_, TextView label_)
        {
            if ((board_[0] == 0 && board_[1] == 0 && board_[2] == 0) ||
                (board_[3] == 0 && board_[4] == 0 && board_[5] == 0) ||
                (board_[6] == 0 && board_[7] == 0 && board_[8] == 0) ||
                (board_[0] == 0 && board_[3] == 0 && board_[6] == 0) ||
                (board_[1] == 0 && board_[4] == 0 && board_[7] == 0) ||
                (board_[2] == 0 && board_[5] == 0 && board_[8] == 0) ||
                (board_[0] == 0 && board_[4] == 0 && board_[8] == 0) ||
                (board_[2] == 0 && board_[4] == 0 && board_[6] == 0))
            {
                label_.setText("O Wins!");

            }

            if ((board_[0] == 1 && board_[1] == 1 && board_[2] == 1) ||
               (board_[3] == 1 && board_[4] == 0 && board_[5] == 1) ||
               (board_[6] == 1 && board_[7] == 0 && board_[8] == 1) ||
               (board_[0] == 1 && board_[3] == 0 && board_[6] == 1) ||
               (board_[1] == 1 && board_[4] == 0 && board_[7] == 1) ||
               (board_[2] == 1 && board_[5] == 0 && board_[8] == 1) ||
               (board_[0] == 1 && board_[4] == 0 && board_[8] == 1) ||
               (board_[2] == 1 && board_[4] == 0 && board_[6] == 1))
            {
                label_.setText("X Wins!");
            }
        }

        public void back(View v)
        {
            finish();
        }

        //"global" variables will store the count to determine X vs 0,
        //as well as keep track of the current board

        int[] board = { 2, 2, 2, 2, 2, 2, 2, 2, 2};  //Creates an array of size 10 to store integers
        // [0, 1, 2]
        // [3, 4, 5]
        // [6, 7, 8]
        // mimics 3d array but is a 2d array for simplicity
        int current_turn = 1; //Player 1 starts with X
        int turn_count = 0; //start with turn 0



        public void pressed(View v)
        {
            turn_count++;
            TextView label = findViewById(R.id.tp_text);

            v.setEnabled(false);
            Button butt = (Button) v;
            if (current_turn == 0) { butt.setText("0"); }
            else { butt.setText("X"); }

            switch (v.getId())
            {
                case R.id.tp1:
                    board[0] = current_turn;
                    break;
                case R.id.tp2:
                    board[1] = current_turn;
                    break;
                case R.id.tp3:
                    board[2] = current_turn;
                    break;
                case R.id.tp4:
                    board[3] = current_turn;
                    break;
                case R.id.tp5:
                    board[4] = current_turn;
                    break;
                case R.id.tp6:
                    board[5] = current_turn;
                    break;
                case R.id.tp7:
                    board[6] = current_turn;
                    break;
                case R.id.tp8:
                    board[7] = current_turn;
                    break;
                case R.id.tp9:
                    board[8] = current_turn;
                    break;
            }

            if (current_turn == 1)
            {
                current_turn = 0;
                label.setText("O Turn");
            }
            else
            {
                current_turn = 1;
                label.setText("X Turn");
            }

            check(board, label);

            if(turn_count == 9) { label.setText("Game Over! It's a Tie!"); }

        }




}