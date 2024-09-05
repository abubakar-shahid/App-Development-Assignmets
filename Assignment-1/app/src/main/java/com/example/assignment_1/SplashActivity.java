// SplashActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        // Display splash screen for 3 seconds
        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, SenderInfoActivity.class));
            finish();
        }, 3000);
    }
}

