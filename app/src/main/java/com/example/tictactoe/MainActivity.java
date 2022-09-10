package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //MainPage
    private Button button1vs1;

    //Damier
    private Button bouttonRetour;
    private Button bouttonReset;

    private ImageView case11;
    private ImageView case12;
    private ImageView case13;
    private ImageView case21;
    private ImageView case22;
    private ImageView case23;
    private ImageView case31;
    private ImageView case32;
    private ImageView case33;

    private ImageView turnToImg;
    private TextView winCroix;
    private TextView winCercle;

    int intCase11 = 0;
    int intCase12 = 0;
    int intCase13 = 0;
    int intCase21 = 0;
    int intCase22 = 0;
    int intCase23 = 0;
    int intCase31 = 0;
    int intCase32 = 0;
    int intCase33 = 0;

    int intCercleWin = 0;
    int intCroixWin = 0;

    private boolean tour = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainPage();

    }

    private void mainPage(){
        setContentView(R.layout.menu_selection_mode);

        button1vs1 = (Button) findViewById(R.id.button1vs1);


        button1vs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run1vs1();
            }
        });
    }


    private void run1vs1(){

        setContentView(R.layout.damier_jeux);

        intCase11 = 0;
        intCase12 = 0;
        intCase13 = 0;
        intCase21 = 0;
        intCase22 = 0;
        intCase23 = 0;
        intCase31 = 0;
        intCase32 = 0;
        intCase33 = 0;


        winCercle = (TextView) findViewById(R.id.textScoreCercle);
        winCercle.setText("Cercle : "+intCercleWin);
        winCroix = (TextView) findViewById(R.id.textScoreCroix);
        winCroix.setText("Croix : "+intCroixWin);

        bouttonRetour = (Button) findViewById(R.id.button_retour);
        bouttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPage();
            }
        });

        bouttonReset = (Button) findViewById(R.id.button_reset);
        bouttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                run1vs1();
            }
        });

        turnToImg = (ImageView) findViewById(R.id.imageTurnTo);
        updateTurnTo();

        case11 = (ImageView) findViewById(R.id.imageCase11);
        case11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase11 == 0){
                    if (tour == true){
                        intCase11 = 1;
                    }else {
                        intCase11 = -1;
                    }
                    changeCase(case11);
                    chekWin();
                }
            }
        });
        case12 = (ImageView) findViewById(R.id.imageCase12);
        case12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase12 == 0){
                    if (tour == true){
                        intCase12 = 1;
                    }else {
                        intCase12 = -1;
                    }
                    changeCase(case12);
                    chekWin();
                }
            }
        });
        case13 = (ImageView) findViewById(R.id.imageCase13);
        case13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase13 == 0){
                    if (tour == true){
                        intCase13 = 1;
                    }else {
                        intCase13 = -1;
                    }
                    changeCase(case13);
                    chekWin();
                }
            }
        });
        case21 = (ImageView) findViewById(R.id.imageCase21);
        case21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase21 == 0){
                    if (tour == true){
                        intCase21 = 1;
                    }else {
                        intCase21 = -1;
                    }
                    changeCase(case21);
                    chekWin();
                }
            }
        });
        case22 = (ImageView) findViewById(R.id.imageCase22);
        case22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase22 == 0){
                    if (tour == true){
                        intCase22 = 1;
                    }else {
                        intCase22 = -1;
                    }
                    changeCase(case22);
                    chekWin();
                }
            }
        });
        case23 = (ImageView) findViewById(R.id.imageCase23);
        case23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase23 == 0){
                    if (tour == true){
                        intCase23 = 1;
                    }else {
                        intCase23 = -1;
                    }
                    changeCase(case23);
                    chekWin();
                }
            }
        });
        case31 = (ImageView) findViewById(R.id.imageCase31);
        case31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase31 == 0){
                    if (tour == true){
                        intCase31 = 1;
                    }else {
                        intCase31 = -1;
                    }
                    changeCase(case31);
                    chekWin();
                }
            }
        });
        case32 = (ImageView) findViewById(R.id.imageCase32);
        case32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase32 == 0){
                    if (tour == true){
                        intCase32 = 1;
                    }else {
                        intCase32 = -1;
                    }
                    changeCase(case32);
                    chekWin();
                }
            }
        });
        case33 = (ImageView) findViewById(R.id.imageCase33);
        case33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (intCase33 == 0){
                    if (tour == true){
                        intCase33 = 1;
                    }else {
                        intCase33 = -1;
                    }
                    changeCase(case33);
                    chekWin();
                }
            }
        });


    }

    public void chekWin(){
        int h1 = intCase11 + intCase12 + intCase13;
        int h2 = intCase21 + intCase22 + intCase23;
        int h3 = intCase31 + intCase32 + intCase33;
        int v1 = intCase11 + intCase21 + intCase31;
        int v2 = intCase12 + intCase22 + intCase32;
        int v3 = intCase13 + intCase23 + intCase33;
        int d1 = intCase11 + intCase22 + intCase33;
        int d2 = intCase13 + intCase22 + intCase31;

        if (h1 == 3 || h1 == -3){addScore(h1);endGame();}
        if (h2 == 3 || h2 == -3){addScore(h2);endGame();}
        if (h3 == 3 || h3 == -3){addScore(h3);endGame();}
        if (v1 == 3 || v1 == -3){addScore(v1);endGame();}
        if (v2 == 3 || v2 == -3){addScore(v2);endGame();}
        if (v3 == 3 || v3 == -3){addScore(v3);endGame();}
        if (d1 == 3 || d1 == -3){addScore(d1);endGame();}
        if (d2 == 3 || d2 == -3){addScore(d2);endGame();}

        if (intCase11!=0 && intCase12!=0 && intCase13!=0 && intCase21!=0 && intCase22!=0 && intCase23!=0 && intCase31!=0 && intCase32!=0 && intCase33!=0){
            endGame();
        }

    }

    public void addScore(int i){
        if (i == 3){
            intCercleWin++;
        }
        else {
            intCroixWin++;
        }
    }

    public void endGame(){
        run1vs1();
    }


    public void changeCase(ImageView imageView){
        Drawable drawable;
        if (tour){
            drawable = getResources().getDrawable(R.drawable.case_cercle);
            setTint(drawable, Color.RED);
            imageView.setImageDrawable(drawable);
            tour = false;
        }else{
            drawable = getResources().getDrawable(R.drawable.case_croix);
            setTint(drawable, Color.BLUE);
            imageView.setImageDrawable(drawable);
            tour = true;
        }
        updateTurnTo();
    }

    public static Drawable setTint(Drawable d, int color) {
        Drawable wrappedDrawable = DrawableCompat.wrap(d);
        DrawableCompat.setTint(wrappedDrawable, color);
        return wrappedDrawable;
    }

    public void updateTurnTo(){
        Drawable drawable;
        if (tour){
            drawable = getResources().getDrawable(R.drawable.case_cercle);
            setTint(drawable, Color.RED);
            turnToImg.setImageDrawable(drawable);
        }else{
            drawable = getResources().getDrawable(R.drawable.case_croix);
            setTint(drawable, Color.BLUE);
            turnToImg.setImageDrawable(drawable);
        }
    }

}