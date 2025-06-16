package com.kayan;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SectionActivity extends AppCompatActivity {

    TextView sectionTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        sectionTitle = findViewById(R.id.sectionTitle);

        String sectionName = getIntent().getStringExtra("SECTION_NAME");
        if (sectionName != null) {
            sectionTitle.setText("واجهة: " + sectionName);
        }
    }
}
