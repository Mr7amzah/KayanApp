package com.kayan;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.kayan.arabia.R;

public class PurchasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchases);

        Toast.makeText(this, "شاشة المشتريات", Toast.LENGTH_SHORT).show();
    }
}
