package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int goalTeamA = 50;
    int yellowCardTeamA = 0;
    int redCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamB = 0;
    int goalTeamB = 0;

    private TextView teamAGoalTextView;
    private TextView teamARedCardTextView;
    private TextView teamAYellowCardTextView;
    private TextView teamBGoalTextView;
    private TextView teamBRedCardTextView;
    private TextView teamBYellowCardTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(5);

        teamAGoalTextView = findViewById(R.id.team_a_goal_score);
        teamARedCardTextView = findViewById(R.id.team_a_red_card_score);
        teamAYellowCardTextView = findViewById(R.id.team_a_yellow_card_score);
        teamBGoalTextView = findViewById(R.id.team_b_goal_score);
        teamBRedCardTextView = findViewById(R.id.team_b_red_card_score);
        teamBYellowCardTextView = findViewById(R.id.team_b_yellow_card_score);


        Button goalButtonTeamA = findViewById(R.id.team_a_button1);
        Button redCardButtonTeamA = findViewById(R.id.team_a_button2);
        Button yellowCardButtonTeamA = findViewById(R.id.team_a_button3);
        Button goalButtonTeamB = findViewById(R.id.team_b_button1);
        Button redCardButtonTeamB = findViewById(R.id.team_b_button2);
        Button yellowCardButtonTeamB = findViewById(R.id.team_b_button3);
        Button resetButton = findViewById(R.id.reset_button);

        goalButtonTeamA.setOnClickListener(this);
        redCardButtonTeamA.setOnClickListener(this);
        yellowCardButtonTeamA.setOnClickListener(this);
        goalButtonTeamB.setOnClickListener(this);
        redCardButtonTeamB.setOnClickListener(this);
        yellowCardButtonTeamB.setOnClickListener(this);
        resetButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.team_a_button1:
                teamAGoalTextView();
                break;
            case R.id.team_a_button2:
                break;
            case R.id.team_a_button3:
                break;
            case R.id.team_b_button1:
                break;
            case R.id.team_b_button2:
                break;
            case R.id.team_b_button3:
                break;
            case R.id.reset_button:
                break;
        }

    }
}

