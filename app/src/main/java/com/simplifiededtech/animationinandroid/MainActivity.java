package com.simplifiededtech.animationinandroid;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] imgArray = {R.drawable.cm1, R.drawable.cm2, R.drawable.cm3};
        flipper = findViewById(R.id.flipper);

        for (int j : imgArray) {
            showImages(j);

        }
    }


    public void showImages(int img) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(5000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setInAnimation(this, android.R.anim.slide_out_right);
        imageView.setOnClickListener(v -> {
            showAds(img);
        });
    }

    private void showAds(int img) {
        if (img == R.drawable.cm1) {
            Toast.makeText(MainActivity.this, img, Toast.LENGTH_SHORT).show();
        } else if (img == R.drawable.cm2) {
            Toast.makeText(MainActivity.this, img, Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this, img, Toast.LENGTH_SHORT).show();

        }
    }
}