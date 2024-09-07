// ReceiverInfoActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ReceiverInfoActivity extends AppCompatActivity {

    // Declare EditText fields for receiver information
    private EditText receiverNameEditText, receiverEmailEditText, receiverContactEditText, receiverAddressEditText, receiverCountryEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_info);

        // Initialize EditText fields for receiver information
        receiverNameEditText = findViewById(R.id.receiver_name);
        receiverEmailEditText = findViewById(R.id.receiver_email);
        receiverContactEditText = findViewById(R.id.receiver_contact);
        receiverAddressEditText = findViewById(R.id.receiver_address);
        receiverCountryEditText = findViewById(R.id.receiver_country);

        // Retrieve sender information passed from SenderInfoActivity
        Intent senderIntent = getIntent();
        String senderEmail = senderIntent.getStringExtra("sender_email");
        String senderFullName = senderIntent.getStringExtra("sender_name");
        String senderContactInfo = senderIntent.getStringExtra("sender_contact_info");
        String senderCountry = senderIntent.getStringExtra("sender_country");
        String senderAddress = senderIntent.getStringExtra("sender_address");

        Button nextButton = findViewById(R.id.btn_next_receiver);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve receiver input data
                String receiverName = receiverNameEditText.getText().toString();
                String receiverEmail = receiverEmailEditText.getText().toString();
                String receiverContact = receiverContactEditText.getText().toString();
                String receiverAddress = receiverAddressEditText.getText().toString();
                String receiverCountry = receiverCountryEditText.getText().toString();

                // Navigate to the Review Information Screen
                Intent intent = new Intent(ReceiverInfoActivity.this, ReviewInfoActivity.class);

                // Pass sender and receiver data to the next activity
                intent.putExtra("sender_email", senderEmail);
                intent.putExtra("sender_name", senderFullName);
                intent.putExtra("sender_contact_info", senderContactInfo);
                intent.putExtra("sender_country", senderCountry);
                intent.putExtra("sender_address", senderAddress);
                intent.putExtra("receiver_name", receiverName);
                intent.putExtra("receiver_email", receiverEmail);
                intent.putExtra("receiver_contact", receiverContact);
                intent.putExtra("receiver_address", receiverAddress);
                intent.putExtra("receiver_country", receiverCountry);

                startActivity(intent);
            }
        });
    }
}
