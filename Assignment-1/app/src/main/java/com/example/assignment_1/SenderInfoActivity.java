// SenderInfoActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SenderInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender_info);

        Button nextButton = findViewById(R.id.btn_next_sender);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the Receiver Information Form
                Intent intent = new Intent(SenderInfoActivity.this, ReceiverInfoActivity.class);
                startActivity(intent);
            }
        });
    }
}
