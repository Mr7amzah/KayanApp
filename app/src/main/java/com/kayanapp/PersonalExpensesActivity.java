package com.kayanapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PersonalExpensesActivity extends AppCompatActivity {

    EditText personNameEditText, personalAmountEditText, reasonEditText;
    Button savePersonalExpenseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_expenses);

        personNameEditText = findViewById(R.id.personNameEditText);
        personalAmountEditText = findViewById(R.id.personalAmountEditText);
        reasonEditText = findViewById(R.id.reasonEditText);
        savePersonalExpenseButton = findViewById(R.id.savePersonalExpenseButton);

        savePersonalExpenseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = personNameEditText.getText().toString().trim();
                String amount = personalAmountEditText.getText().toString().trim();
                String reason = reasonEditText.getText().toString().trim();

                if (name.isEmpty() || amount.isEmpty()) {
                    Toast.makeText(PersonalExpensesActivity.this, "يرجى تعبئة الاسم والمبلغ", Toast.LENGTH_SHORT).show();
                } else {
                    // حفظ البيانات
                    Toast.makeText(PersonalExpensesActivity.this, "تم حفظ المصروف الشخصي", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
