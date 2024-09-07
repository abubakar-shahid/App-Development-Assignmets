// ReceiverInfoActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ReceiverInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_info);

        Button nextButton = findViewById(R.id.btn_next_receiver);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Review Information Screen
                Intent intent = new Intent(ReceiverInfoActivity.this, ReviewInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
