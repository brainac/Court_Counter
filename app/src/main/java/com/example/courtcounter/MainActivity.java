package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;
    int goalTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(5);
    }

    /**
     * Displays goal score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays yellow card score for Team A.
     */
    public void displayYellowCardTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Red card score for Team A.
     */
    public void displayRedCardTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays goal score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays yellow card score for Team B.
     */
    public void displayYellowCardTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Red card score for Team B.
     */
    public void displayRedCardTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the goal button is clicked for Team A.
     */
    public void plusOneGoalTeamA(View view) {
        goalTeamA = goalTeamA + 1;
        displayGoalForTeamA(goalTeamA);
    }

    /**
     * This method is called when the yellow card button is clicked for Team A.
     */
    public void plusYellowCardTeamA(View view) {
        yellowCardTeamA = yellowCardTeamA + 1;
        displayYellowCardTeamA(yellowCardTeamA);
    }

    /**
     * This method is called when the red card button is clicked for Team A.
     */
    public void plusOneRedCardTeamA(View view) {
        redCardTeamA = redCardTeamA + 1;
        displayRedCardTeamA(redCardTeamA);
    }

    /**
     * This method is called when the goal button is clicked for Team B.
     */
    public void plusOneGoalTeamB(View view) {
        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    /**
     * This method is called when the yellow card button is clicked for Team B.
     */
    public void plusYellowCardTeamB(View view) {
        yellowCardTeamB = yellowCardTeamB + 1;
        displayYellowCardTeamB(yellowCardTeamB);
    }

    /**
     * This method is called when the red card button is clicked for Team B.
     */
    public void plusOneRedCardTeamB(View view) {
        redCardTeamB = redCardTeamB + 1;
        displayRedCardTeamB(redCardTeamB);
    }


    /**
     * This method is called when the Reset button is clicked.
     */
    public void resetAllScores(View view) {
        int goalTeamA = 0;
        int yellowCardTeamA = 0;
        int redCardTeamA = 0;
        int yellowCardTeamB = 0;
        int redCardTeamB = 0;
        int goalTeamB = 0;
        displayGoalForTeamA(goalTeamA);
        displayYellowCardTeamA(yellowCardTeamA);
        displayRedCardTeamA(redCardTeamA);
        displayGoalForTeamB(goalTeamB);
        displayYellowCardTeamB(yellowCardTeamB);
        displayRedCardTeamB(redCardTeamB);
    }
}