package com.kayanapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ExpensesActivity extends AppCompatActivity {

    EditText expenseTypeEditText, expenseAmountEditText, expenseNoteEditText;
    Button saveExpenseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);

        expenseTypeEditText = findViewById(R.id.expenseTypeEditText);
        expenseAmountEditText = findViewById(R.id.expenseAmountEditText);
        expenseNoteEditText = findViewById(R.id.expenseNoteEditText);
        saveExpenseButton = findViewById(R.id.saveExpenseButton);

        saveExpenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = expenseTypeEditText.getText().toString().trim();
                String amount = expenseAmountEditText.getText().toString().trim();
                String note = expenseNoteEditText.getText().toString().trim();

                if (type.isEmpty() || amount.isEmpty()) {
                    Toast.makeText(ExpensesActivity.this, "الرجاء تعبئة نوع المصروف والمبلغ", Toast.LENGTH_SHORT).show();
                } else {
                    // حفظ البيانات هنا - حالياً عرض توست فقط
                    Toast.makeText(ExpensesActivity.this, "تم حفظ المصروف", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
