// SenderInfoActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SenderInfoActivity extends AppCompatActivity {

    // Declare EditText fields
    private EditText emailEditText, fullNameEditText, contactInfoEditText, countryEditText, addressEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender_info);

        // Initialize EditText fields
        emailEditText = findViewById(R.id.sender_email);
        fullNameEditText = findViewById(R.id.sender_name);
        contactInfoEditText = findViewById(R.id.sender_contact);
        countryEditText = findViewById(R.id.sender_country);
        addressEditText = findViewById(R.id.sender_address);

        Button nextButton = findViewById(R.id.btn_next_sender);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve input from EditText fields
                String email = emailEditText.getText().toString();
                String fullName = fullNameEditText.getText().toString();
                String contactInfo = contactInfoEditText.getText().toString();
                String country = countryEditText.getText().toString();
                String address = addressEditText.getText().toString();

                // Navigate to the Receiver Information Form
                Intent intent = new Intent(SenderInfoActivity.this, ReceiverInfoActivity.class);

                // Pass data to the next activity
                intent.putExtra("sender_email", email);
                intent.putExtra("sender_name", fullName);
                intent.putExtra("sender_country", country);
                intent.putExtra("sender_address", address);
                intent.putExtra("sender_contact", contactInfo);

                startActivity(intent);
            }
        });
    }
}
