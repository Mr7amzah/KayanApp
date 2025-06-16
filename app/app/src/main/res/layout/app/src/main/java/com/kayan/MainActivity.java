package com.kayan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button salesButton, purchasesButton, expensesButton, payrollButton, manufacturingButton, reportsButton, settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salesButton = findViewById(R.id.salesButton);
        purchasesButton = findViewById(R.id.purchasesButton);
        expensesButton = findViewById(R.id.expensesButton);
        payrollButton = findViewById(R.id.payrollButton);
        manufacturingButton = findViewById(R.id.manufacturingButton);
        reportsButton = findViewById(R.id/reportsButton);
        settingsButton = findViewById(R.id/settingsButton);

        salesButton.setOnClickListener(view -> openSection("المبيعات"));
        purchasesButton.setOnClickListener(view -> openSection("المشتريات"));
        expensesButton.setOnClickListener(view -> openSection("المصروفات"));
        payrollButton.setOnClickListener(view -> openSection("الرواتب"));
        manufacturingButton.setOnClickListener(view -> openSection("أوامر التصنيع"));
        reportsButton.setOnClickListener(view -> openSection("التقارير"));
        settingsButton.setOnClickListener(view -> openSection("الإعدادات"));
    }

    private void openSection(String sectionName) {
        Intent intent = new Intent(this, SectionActivity.class);
        intent.putExtra("SECTION_NAME", sectionName);
        startActivity(intent);
    }
}
