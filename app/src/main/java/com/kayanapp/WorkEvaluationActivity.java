package com.kayanapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class WorkEvaluationActivity extends AppCompatActivity {

    EditText overtimeHoursEditText, damageReportEditText;
    RatingBar ratingBar;
    Button saveEvaluationButton;
    TextView resultEvaluationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_evaluation);

        overtimeHoursEditText = findViewById(R.id.overtimeHoursEditText);
        damageReportEditText = findViewById(R.id.damageReportEditText);
        ratingBar = findViewById(R.id.ratingBar);
        saveEvaluationButton = findViewById(R.id.saveEvaluationButton);
        resultEvaluationTextView = findViewById(R.id.resultEvaluationTextView);

        saveEvaluationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String overtime = overtimeHoursEditText.getText().toString().trim();
                String damage = damageReportEditText.getText().toString().trim();
                float rating = ratingBar.getRating();

                String result = "ساعات إضافية: " + overtime + " ساعة\n" +
                        "تقرير التلفيات: " + damage + "\n" +
                        "تقييم الأداء: " + rating + " من 5";

                resultEvaluationTextView.setText(result);
                Toast.makeText(WorkEvaluationActivity.this, "تم الحفظ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
