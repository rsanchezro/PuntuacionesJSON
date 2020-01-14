package com.roberto.puntuacionesjson;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int puntosRMadrid = 0;

    // Tracks the score for Team B
    int puntosFCBarcelona = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        puntosRMadrid = puntosRMadrid + 1;
        displayForTeamA(puntosRMadrid);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        puntosRMadrid = puntosRMadrid + 2;
        displayForTeamA(puntosRMadrid);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        puntosRMadrid = puntosRMadrid + 3;
        displayForTeamA(puntosRMadrid);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        puntosFCBarcelona = puntosFCBarcelona + 1;
        displayForTeamB(puntosFCBarcelona);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        puntosFCBarcelona = puntosFCBarcelona + 2;
        displayForTeamB(puntosFCBarcelona);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        puntosFCBarcelona = puntosFCBarcelona + 3;
        displayForTeamB(puntosFCBarcelona);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        puntosRMadrid = 0;
        puntosFCBarcelona = 0;
        displayForTeamA(puntosRMadrid);
        displayForTeamB(puntosFCBarcelona);
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
}
