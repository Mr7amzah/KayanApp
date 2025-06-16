package com.kayanapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SalariesActivity extends AppCompatActivity {

    EditText employeeNameEditText, salaryAmountEditText, salaryMonthEditText;
    Button saveSalaryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salaries);

        employeeNameEditText = findViewById(R.id.employeeNameEditText);
        salaryAmountEditText = findViewById(R.id.salaryAmountEditText);
        salaryMonthEditText = findViewById(R.id.salaryMonthEditText);
        saveSalaryButton = findViewById(R.id.saveSalaryButton);

        saveSalaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = employeeNameEditText.getText().toString().trim();
                String amount = salaryAmountEditText.getText().toString().trim();
                String month = salaryMonthEditText.getText().toString().trim();

                if (name.isEmpty() || amount.isEmpty() || month.isEmpty()) {
                    Toast.makeText(SalariesActivity.this, "يرجى تعبئة جميع الحقول", Toast.LENGTH_SHORT).show();
                } else {
                    // حفظ البيانات
                    Toast.makeText(SalariesActivity.this, "تم تسجيل الراتب", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
