package com.kayanapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfitCostActivity extends AppCompatActivity {

    EditText totalSalesEditText, totalExpensesEditText;
    Button calculateProfitButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit_cost);

        totalSalesEditText = findViewById(R.id.totalSalesEditText);
        totalExpensesEditText = findViewById(R.id.totalExpensesEditText);
        calculateProfitButton = findViewById(R.id.calculateProfitButton);
        resultTextView = findViewById(R.id.resultTextView);

        calculateProfitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String salesStr = totalSalesEditText.getText().toString().trim();
                String expensesStr = totalExpensesEditText.getText().toString().trim();

                if (salesStr.isEmpty() || expensesStr.isEmpty()) {
                    resultTextView.setText("يرجى تعبئة المبيعات والمصروفات");
                    return;
                }

                double sales = Double.parseDouble(salesStr);
                double expenses = Double.parseDouble(expensesStr);
                double profit = sales - expenses;

                resultTextView.setText("الربح الصافي: " + profit + " ريال");
            }
        });
    }
}
