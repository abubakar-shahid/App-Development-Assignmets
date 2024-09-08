package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ReceiverInfoActivity extends AppCompatActivity {

    private EditText receiverNameEditText, receiverEmailEditText, receiverContactEditText, receiverAddressEditText, receiverCountryEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_info);

        receiverNameEditText = findViewById(R.id.receiver_name);
        receiverEmailEditText = findViewById(R.id.receiver_email);
        receiverContactEditText = findViewById(R.id.receiver_contact);
        receiverAddressEditText = findViewById(R.id.receiver_address);
        receiverCountryEditText = findViewById(R.id.receiver_country);

        Intent senderIntent = getIntent();
        String senderEmail = senderIntent.getStringExtra("sender_email");
        String senderFullName = senderIntent.getStringExtra("sender_name");
        String senderCountry = senderIntent.getStringExtra("sender_country");
        String senderAddress = senderIntent.getStringExtra("sender_address");
        String senderContactInfo = senderIntent.getStringExtra("sender_contact");

        Button nextButton = findViewById(R.id.btn_next_receiver);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String receiverName = receiverNameEditText.getText().toString();
                String receiverEmail = receiverEmailEditText.getText().toString();
                String receiverContact = receiverContactEditText.getText().toString();
                String receiverAddress = receiverAddressEditText.getText().toString();
                String receiverCountry = receiverCountryEditText.getText().toString();

                Intent intent = new Intent(ReceiverInfoActivity.this, ReviewInfoActivity.class);

                intent.putExtra("sender_email", senderEmail);
                intent.putExtra("sender_name", senderFullName);
                intent.putExtra("sender_country", senderCountry);
                intent.putExtra("sender_address", senderAddress);
                intent.putExtra("sender_contact", senderContactInfo);
                intent.putExtra("receiver_email", receiverEmail);
                intent.putExtra("receiver_name", receiverName);
                intent.putExtra("receiver_country", receiverCountry);
                intent.putExtra("receiver_address", receiverAddress);
                intent.putExtra("receiver_contact", receiverContact);

                startActivity(intent);
            }
        });
    }
}
