package com.example.assignment_2;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TaskInputFragment.OnTaskAddedListener {

    private static final String TAG = "MainActivity";
    private List<Task> taskList;
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskList = new ArrayList<>();
        RecyclerView taskRecyclerView = findViewById(R.id.taskRecyclerView);
        taskAdapter = new TaskAdapter(taskList);
        taskRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        taskRecyclerView.setAdapter(taskAdapter);

        FloatingActionButton fabAddTask = findViewById(R.id.fabAddTask);
        fabAddTask.setOnClickListener(v -> openTaskInputFragment());

        Log.d(TAG, "onCreate");
    }

    private void openTaskInputFragment() {
        TaskInputFragment taskInputFragment = new TaskInputFragment();
        taskInputFragment.show(getSupportFragmentManager(), "TaskInputFragment");
    }

    @Override
    public void onTaskAdded(Task task) {
        taskList.add(task);
        taskAdapter.notifyItemInserted(taskList.size() - 1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}