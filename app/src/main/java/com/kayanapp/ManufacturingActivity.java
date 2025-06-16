package com.kayanapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ManufacturingActivity extends AppCompatActivity {

    EditText itemTypeEditText, itemSizeEditText, itemQuantityEditText, itemNotesEditText;
    Button saveManufactureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manufacturing);

        itemTypeEditText = findViewById(R.id.itemTypeEditText);
        itemSizeEditText = findViewById(R.id.itemSizeEditText);
        itemQuantityEditText = findViewById(R.id.itemQuantityEditText);
        itemNotesEditText = findViewById(R.id.itemNotesEditText);
        saveManufactureButton = findViewById(R.id.saveManufactureButton);

        saveManufactureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = itemTypeEditText.getText().toString().trim();
                String size = itemSizeEditText.getText().toString().trim();
                String qty = itemQuantityEditText.getText().toString().trim();
                String notes = itemNotesEditText.getText().toString().trim();

                if (type.isEmpty() || size.isEmpty() || qty.isEmpty()) {
                    Toast.makeText(ManufacturingActivity.this, "الرجاء تعبئة النوع، المقاس، والعدد", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ManufacturingActivity.this, "تم حفظ أمر التصنيع", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
