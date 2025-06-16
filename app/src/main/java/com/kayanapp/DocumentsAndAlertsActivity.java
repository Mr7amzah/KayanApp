package com.kayanapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class DocumentsAndAlertsActivity extends AppCompatActivity {

    EditText docNameEditText, expiryDateEditText, phoneNumberEditText;
    Button sendWhatsAppButton, checkExpiryButton;
    TextView alertResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents_alerts);

        docNameEditText = findViewById(R.id.docNameEditText);
        expiryDateEditText = findViewById(R.id.expiryDateEditText);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        sendWhatsAppButton = findViewById(R.id.sendWhatsAppButton);
        checkExpiryButton = findViewById(R.id.checkExpiryButton);
        alertResultTextView = findViewById(R.id.alertResultTextView);

        checkExpiryButton.setOnClickListener(v -> {
            String expiryDate = expiryDateEditText.getText().toString().trim();
            // مثال مبسط فقط بدون حساب فعلي للتواريخ
            alertResultTextView.setText("تنبيه: الوثيقة " + docNameEditText.getText() + " تنتهي بتاريخ " + expiryDate);
        });

        sendWhatsAppButton.setOnClickListener(v -> {
            String phone = phoneNumberEditText.getText().toString().trim();
            String message = "تنبيه من كيان: الوثيقة " + docNameEditText.getText() + " ستنتهي بتاريخ " + expiryDateEditText.getText();

            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("https://wa.me/" + phone + "?text=" + Uri.encode(message)));
            startActivity(sendIntent);
        });
    }
}
