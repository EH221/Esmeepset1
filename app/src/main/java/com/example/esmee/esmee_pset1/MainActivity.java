package com.example.esmee.esmee_pset1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  {
    ImageView ears;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView hat;
    ImageView mouth;
    ImageView mustache;
    ImageView nose;
    ImageView shoes;
    ImageView arms;
    CheckBox checkBoxEyebrows;
    CheckBox checkBoxEars;
    CheckBox checkBoxEyes;
    CheckBox checkBoxGlasses;
    CheckBox checkBoxHat;
    CheckBox checkBoxMouth;
    CheckBox checkBoxMustache;
    CheckBox checkBoxNose;
    CheckBox checkBoxShoes;
    CheckBox checkBoxArms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mouth = findViewById(R.id.mouth);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);
        arms = findViewById(R.id.arms);
        checkBoxEyebrows = findViewById(R.id.checkBoxEyebrows);
        checkBoxEars = findViewById(R.id.checkBoxEars);
        checkBoxEyes = findViewById(R.id.checkBoxEyes);
        checkBoxGlasses = findViewById(R.id.checkBoxGlasses);
        checkBoxHat = findViewById(R.id.checkBoxHat);
        checkBoxMouth = findViewById(R.id.checkBoxMouth);
        checkBoxMustache = findViewById(R.id.checkBoxMustache);
        checkBoxNose = findViewById(R.id.checkBoxNose);
        checkBoxShoes = findViewById(R.id.checkBoxShoes);
        checkBoxArms = findViewById(R.id.checkBoxArms);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(checkBoxEyebrows, true);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        boolean checkBoxEyebrows = savedInstanceState.getBoolean(checkBoxEyebrows);
    }

    public void checkBoxEyebrowsClicked(View view) {
        if (checkBoxEyebrows.isChecked())
            eyebrows.setVisibility(View.VISIBLE);
        else
            eyebrows.setVisibility(View.INVISIBLE);
        }

    public void checkBoxEarsClicked(View view) {
        if (checkBoxEars.isChecked())
            ears.setVisibility(View.VISIBLE);
        else
            ears.setVisibility(View.INVISIBLE);
    }

    public void checkBoxEyesClicked(View view) {
        if (checkBoxEyes.isChecked())
            eyes.setVisibility(View.VISIBLE);
        else
            eyes.setVisibility(View.INVISIBLE);
    }

    public void checkBoxGlassesClicked(View view) {
        if (checkBoxGlasses.isChecked())
            glasses.setVisibility(View.VISIBLE);
        else
            glasses.setVisibility(View.INVISIBLE);
    }

    public void checkBoxHatClicked(View view) {
        if (checkBoxHat.isChecked())
            hat.setVisibility(View.VISIBLE);
        else
            hat.setVisibility(View.INVISIBLE);
    }

    public void checkBoxMouthClicked(View view) {
        if (checkBoxMouth.isChecked())
            mouth.setVisibility(View.VISIBLE);
        else
            mouth.setVisibility(View.INVISIBLE);
    }

    public void checkBoxMustacheClicked(View view) {
        if (checkBoxMustache.isChecked())
            mustache.setVisibility(View.VISIBLE);
        else
            mustache.setVisibility(View.INVISIBLE);
    }

    public void checkBoxNoseClicked(View view) {
        if (checkBoxNose.isChecked())
            nose.setVisibility(View.VISIBLE);
        else
            nose.setVisibility(View.INVISIBLE);
    }

    public void checkBoxShoesClicked(View view) {
        if (checkBoxShoes.isChecked())
            shoes.setVisibility(View.VISIBLE);
        else
            shoes.setVisibility(View.INVISIBLE);
    }

    public void checkBoxArmsClicked(View view) {
        if (checkBoxArms.isChecked())
            arms.setVisibility(View.VISIBLE);
        else
            arms.setVisibility(View.INVISIBLE);
    }
}

