package com.kayanapp;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class StaffMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_main);

        Toast.makeText(this, "واجهة الموظف - صلاحيات محدودة", Toast.LENGTH_LONG).show();
    }
}
. 

