package com.example.assignment_2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logoImageView = findViewById(R.id.logoImageView);

        AnimationSet animationSet = new AnimationSet(true);

        TranslateAnimation translateAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 0f,
                Animation.RELATIVE_TO_PARENT, 0f,
                Animation.RELATIVE_TO_PARENT, -0.5f,
                Animation.RELATIVE_TO_PARENT, 0f
        );
        translateAnimation.setDuration(1500);

        ScaleAnimation scaleAnimation = new ScaleAnimation(
                0.5f, 1.2f, 0.5f, 1.2f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        scaleAnimation.setDuration(1500);

        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);

        logoImageView.startAnimation(animationSet);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivityForResult(intent, 1);
            finish();
        }, SPLASH_DURATION);
    }
}
