package com.example.koala.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faultTeamA = 0;
    int faultTeamB = 0;
    int shotsTeamA = 0;
    int shotsTeamB = 0;
    int cornersTeamA = 0;
    int cornersTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Reset Button.
     */
    public void resetScore(View v) {
        displayForTeamA(0);
        displayForTeamB(0);

        displayForTeamAfault(0);
        displayForTeamBfault(0);

        displayForTeamAshots(0);
        displayForTeamBshots(0);

        displayForTeamAcorners(0);
        displayForTeamBcorners(0);

        scoreTeamA = 0;
        scoreTeamB = 0;

        faultTeamA = 0;
        faultTeamB = 0;

        shotsTeamA = 0;
        shotsTeamB = 0;

        cornersTeamA = 0;
        cornersTeamB = 0;


    }



    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Goal! for Team A.
     */
    public void addGoalForTeamA (View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays Goal! for Team B.
     */
    public void addGoalForTeamB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }



    /**
     * Displays 1 for Team A.
     */
    public void addOneForTeamA (View v) {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays 1 for Team B.
     */
    public void addOneForTeamB (View v) {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }













    /**
     * Displays the given fault for Team A.
     */
    public void displayForTeamAfault (int fault) {
        TextView faultView = (TextView) findViewById(R.id.team_a_fault);
        faultView.setText(String.valueOf(fault));
    }


    /**
     * Displays fault for Team A.
     */
    public void addFaultForTeamA (View v) {
        faultTeamA = faultTeamA + 1;
        displayForTeamAfault(faultTeamA);
    }





    /**
     * Displays the given shots for Team A.
     */
    public void displayForTeamAshots (int shots) {
        TextView shotsView = (TextView) findViewById(R.id.team_a_shots);
        shotsView.setText(String.valueOf(shots));
    }


    /**
     * Displays shots for Team A.
     */
    public void addShotsForTeamA (View v) {
        shotsTeamA = shotsTeamA + 1;
        displayForTeamAshots(shotsTeamA);
    }









    /**
     * Displays the given fault for Team B.
     */
    public void displayForTeamBfault (int fault) {
        TextView faultView = (TextView) findViewById(R.id.team_b_fault);
        faultView.setText(String.valueOf(fault));
    }


    /**
     * Displays fault for Team B.
     */
    public void addFaultForTeamB (View v) {
        faultTeamB = faultTeamB + 1;
        displayForTeamBfault(faultTeamB);
    }





    /**
     * Displays the given shots for Team B.
     */
    public void displayForTeamBshots (int shots) {
        TextView shotsView = (TextView) findViewById(R.id.team_b_shots);
        shotsView.setText(String.valueOf(shots));
    }


    /**
     * Displays shots for Team B.
     */
    public void addShotsForTeamB (View v) {
        shotsTeamB = shotsTeamB + 1;
        displayForTeamBshots(shotsTeamB);
    }


    /**
     * Displays the given corners for Team A.
     */
    public void displayForTeamAcorners (int corners) {
        TextView cornersView = (TextView) findViewById(R.id.team_a_corners);
        cornersView.setText(String.valueOf(corners));
    }


    /**
     * Displays corners for Team A.
     */
    public void addCornersForTeamA (View v) {
        cornersTeamA = cornersTeamA + 1;
        displayForTeamAcorners(cornersTeamA);
    }



    /**
     * Displays the given corners for Team B.
     */
    public void displayForTeamBcorners (int corners) {
        TextView cornersView = (TextView) findViewById(R.id.team_b_corners);
        cornersView.setText(String.valueOf(corners));
    }


    /**
     * Displays corners for Team B.
     */
    public void addCornersForTeamB (View v) {
        cornersTeamB = cornersTeamB + 1;
        displayForTeamBcorners(cornersTeamB);
    }

}



