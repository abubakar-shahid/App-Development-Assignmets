// ReviewInfoActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ReviewInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_info);

//        FloatingActionButton fabBackToSender = findViewById(R.id.fab_back_to_sender);
//        fabBackToSender.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Navigate back to the Sender Information Form
//                Intent intent = new Intent(ReviewInfoActivity.this, SenderInfoActivity.class);
//                startActivity(intent);
//            }
//        });

        // Retrieve and display the sender and receiver information
        // This part should populate data into the appropriate TextViews
    }
}
