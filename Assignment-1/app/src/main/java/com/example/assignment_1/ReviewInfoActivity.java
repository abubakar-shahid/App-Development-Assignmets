// ReviewInfoActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewInfoActivity extends AppCompatActivity {

    private TableLayout infoTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_info);

        // Initialize TableLayout
        infoTable = findViewById(R.id.info_table);

        // Retrieve sender and receiver information passed from ReceiverInfoActivity
        Intent intent = getIntent();
        String senderFullName = intent.getStringExtra("sender_name");
        String senderCountry = intent.getStringExtra("sender_country");
        String senderAddress = intent.getStringExtra("sender_address");
        String senderContactInfo = intent.getStringExtra("sender_contact");

        String receiverFullName = intent.getStringExtra("receiver_name");
        String receiverCountry = intent.getStringExtra("receiver_country");
        String receiverAddress = intent.getStringExtra("receiver_address");
        String receiverContact = intent.getStringExtra("receiver_contact");

        // Populate TableLayout with sender and receiver information
        addTableRow(senderFullName, senderCountry, senderAddress, senderContactInfo);
//        addArrowRow();
        addTableRow(receiverFullName, receiverCountry, receiverAddress, receiverContact);
    }

    private void addTableRow(String fullName, String country, String address, String contactInfo) {
        // Create a new TableRow
        TableRow tableRow = new TableRow(this);

        // Create TextViews for each column
        TextView fullNameTextView = new TextView(this);
        fullNameTextView.setText(fullName);

        TextView countryTextView = new TextView(this);
        countryTextView.setText(country);

        TextView addressTextView = new TextView(this);
        addressTextView.setText(address);

        TextView contactInfoTextView = new TextView(this);
        contactInfoTextView.setText(contactInfo);

        // Add TextViews to the TableRow
        tableRow.addView(fullNameTextView);
        tableRow.addView(countryTextView);
        tableRow.addView(addressTextView);
        tableRow.addView(contactInfoTextView);

        // Add TableRow to the TableLayout
        infoTable.addView(tableRow);
    }

//    private void addArrowRow() {
//        // Create a new TableRow
//        TableRow tableRow = new TableRow(this);
//
//        // Create ImageView for arrow
//        ImageView arrowImageView = new ImageView(this);
//        arrowImageView.setImageResource(R.drawable.arrow); // Replace with your arrow drawable
//        arrowImageView.setContentDescription(getString(R.string.transaction_arrow_description));
//
//        // Add ImageView to the TableRow
//        tableRow.addView(arrowImageView);
//
//        // Add TableRow to the TableLayout
//        infoTable.addView(tableRow);
//    }
}
