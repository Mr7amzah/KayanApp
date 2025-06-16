package com.kayanapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Spinner roleSpinner;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        roleSpinner = findViewById(R.id.roleSpinner);
        loginButton = findViewById(R.id.loginButton);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                new String[]{"مدير", "موظف"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        roleSpinner.setAdapter(adapter);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usernameEditText.getText().toString().trim();
                String pass = passwordEditText.getText().toString().trim();
                String role = roleSpinner.getSelectedItem().toString();

                if (user.equals("admin") && pass.equals("1234") && role.equals("مدير")) {
                    Toast.makeText(LoginActivity.this, "تم الدخول كمدير", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, MainActivity.class)); // صلاحيات كاملة
                } else if (user.equals("staff") && pass.equals("1234") && role.equals("موظف")) {
                    Toast.makeText(LoginActivity.this, "تم الدخول كموظف", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, StaffMainActivity.class)); // صلاحيات محدودة
                } else {
                    Toast.makeText(LoginActivity.this, "بيانات الدخول غير صحيحة", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
