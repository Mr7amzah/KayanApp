package com.kayanapp;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class TaskScheduleActivity extends AppCompatActivity {

    EditText taskDescriptionEditText, taskDateEditText;
    Button addTaskButton;
    ListView taskListView;

    ArrayList<String> taskList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_schedule);

        taskDescriptionEditText = findViewById(R.id.taskDescriptionEditText);
        taskDateEditText = findViewById(R.id.taskDateEditText);
        addTaskButton = findViewById(R.id.addTaskButton);
        taskListView = findViewById(R.id.taskListView);

        taskList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, taskList);
        taskListView.setAdapter(adapter);

        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String description = taskDescriptionEditText.getText().toString().trim();
                String date = taskDateEditText.getText().toString().trim();

                if (!description.isEmpty() && !date.isEmpty()) {
                    taskList.add("📌 " + description + " | 🗓 " + date + " | ⏳ غير منجز");
                    adapter.notifyDataSetChanged();
                    taskDescriptionEditText.setText("");
                    taskDateEditText.setText("");
                }
            }
        });

        taskListView.setOnItemClickListener((parent, view, position, id) -> {
            String task = taskList.get(position);
            if (task.contains("⏳")) {
                taskList.set(position, task.replace("⏳ غير منجز", "✅ تم الإنجاز"));
            } else {
                taskList.set(position, task.replace("✅ تم الإنجاز", "⏳ غير منجز"));
            }
            adapter.notifyDataSetChanged();
        });
    }
}
