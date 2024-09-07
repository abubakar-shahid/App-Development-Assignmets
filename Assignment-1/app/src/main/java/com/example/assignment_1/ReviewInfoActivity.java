// ReviewInfoActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewInfoActivity extends AppCompatActivity {

    // Declare TextViews for displaying the information
    private TextView senderEmailTextView, senderFullNameTextView, senderContactTextView, senderCountryTextView, senderAddressTextView;
    private TextView receiverNameTextView, receiverEmailTextView, receiverContactTextView, receiverAddressTextView, receiverCountryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_info);

        // Initialize TextViews for sender and receiver information
        senderEmailTextView = findViewById(R.id.sender_email);
        senderFullNameTextView = findViewById(R.id.sender_name);
        senderContactTextView = findViewById(R.id.sender_contact);
        senderCountryTextView = findViewById(R.id.sender_country);
        senderAddressTextView = findViewById(R.id.sender_address);

        receiverNameTextView = findViewById(R.id.receiver_name);
        receiverEmailTextView = findViewById(R.id.receiver_email);
        receiverContactTextView = findViewById(R.id.receiver_contact);
        receiverAddressTextView = findViewById(R.id.receiver_address);
        receiverCountryTextView = findViewById(R.id.receiver_country);

        // Retrieve sender and receiver information passed from ReceiverInfoActivity
        Intent intent = getIntent();
        String senderEmail = intent.getStringExtra("sender_email");
        String senderFullName = intent.getStringExtra("sender_name");
        String senderContactInfo = intent.getStringExtra("sender_contact_info");
        String senderCountry = intent.getStringExtra("sender_country");
        String senderAddress = intent.getStringExtra("sender_address");

        String receiverName = intent.getStringExtra("receiver_name");
        String receiverEmail = intent.getStringExtra("receiver_email");
        String receiverContact = intent.getStringExtra("receiver_contact");
        String receiverAddress = intent.getStringExtra("receiver_address");
        String receiverCountry = intent.getStringExtra("receiver_country");

        // Populate TextViews with retrieved information
        senderEmailTextView.setText(senderEmail);
        senderFullNameTextView.setText(senderFullName);
        senderContactTextView.setText(senderContactInfo);
        senderCountryTextView.setText(senderCountry);
        senderAddressTextView.setText(senderAddress);

        receiverNameTextView.setText(receiverName);
        receiverEmailTextView.setText(receiverEmail);
        receiverContactTextView.setText(receiverContact);
        receiverAddressTextView.setText(receiverAddress);
        receiverCountryTextView.setText(receiverCountry);
    }
}
