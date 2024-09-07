// ReviewInfoActivity.java

package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewInfoActivity extends AppCompatActivity {

    private TableLayout infoTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_info);

        // Initialize TableLayout
        infoTable = findViewById(R.id.info_table);

        // Initialize Button and set click listener
        Button btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the Sender Information Form
                Intent intent = new Intent(ReviewInfoActivity.this, SenderInfoActivity.class);
                startActivity(intent);
            }
        });

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
        addArrowRow();
        addTableRow(receiverFullName, receiverCountry, receiverAddress, receiverContact);
    }

    private void addTableRow(String fullName, String country, String address, String contactInfo) {
        // Create a new TableRow
        TableRow tableRow = new TableRow(this);

        // Set an ID for the TableRow (optional, useful if you want to find and manage specific rows)
        tableRow.setId(View.generateViewId());

        // Create TextViews for each column
        TextView fullNameTextView = new TextView(this);
        fullNameTextView.setText(fullName);
        fullNameTextView.setPadding(getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small));

        TextView countryTextView = new TextView(this);
        countryTextView.setText(country);
        countryTextView.setPadding(getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small));

        TextView addressTextView = new TextView(this);
        addressTextView.setText(address);
        addressTextView.setPadding(getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small));

        TextView contactInfoTextView = new TextView(this);
        contactInfoTextView.setText(contactInfo);
        contactInfoTextView.setPadding(getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small),
                getResources().getDimensionPixelSize(R.dimen.padding_small));

        // Add TextViews to the TableRow
        tableRow.addView(fullNameTextView);
        tableRow.addView(countryTextView);
        tableRow.addView(addressTextView);
        tableRow.addView(contactInfoTextView);

        // Append the TableRow to the TableLayout without clearing it
        infoTable.addView(tableRow);
    }

    private void addArrowRow() {
        TableRow tableRow = new TableRow(this);

        ImageView arrowImageView = new ImageView(this);
        arrowImageView.setImageResource(R.drawable.arrow);
        arrowImageView.setContentDescription(getString(R.string.transaction_arrow_description));

        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                getResources().getDimensionPixelSize(R.dimen.text_size_large),
                getResources().getDimensionPixelSize(R.dimen.text_size_large)
        );
        arrowImageView.setLayoutParams(layoutParams);

        tableRow.addView(arrowImageView);

        // Append the Arrow Row to the TableLayout without clearing it
        infoTable.addView(tableRow);
    }
}
