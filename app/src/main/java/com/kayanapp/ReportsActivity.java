package com.kayanapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReportsActivity extends AppCompatActivity {

    TextView dailyReportTextView, monthlyReportTextView, yearlyReportTextView;
    Button loadDailyButton, loadMonthlyButton, loadYearlyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);

        dailyReportTextView = findViewById(R.id.dailyReportTextView);
        monthlyReportTextView = findViewById(R.id.monthlyReportTextView);
        yearlyReportTextView = findViewById(R.id.yearlyReportTextView);

        loadDailyButton = findViewById(R.id.loadDailyButton);
        loadMonthlyButton = findViewById(R.id.loadMonthlyButton);
        loadYearlyButton = findViewById(R.id.loadYearlyButton);

        loadDailyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dailyReportTextView.setText("📅 تقرير اليوم:\nالمبيعات: 2500 ريال\nالمصروفات: 900 ريال\nالرواتب: 0\nالربح: 1600 ريال");
            }
        });

        loadMonthlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                monthlyReportTextView.setText("📆 تقرير الشهر:\nالمبيعات: 52000 ريال\nالمصروفات: 19500 ريال\nالرواتب: 12000 ريال\nالربح: 20500 ريال");
            }
        });

        loadYearlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yearlyReportTextView.setText("📊 تقرير السنة:\nالمبيعات: 620000 ريال\nالمصروفات: 230000 ريال\nالرواتب: 144000 ريال\nالربح: 246000 ريال");
            }
        });
    }
}

