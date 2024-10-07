package com.example.assignment_2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class TaskInputFragment extends DialogFragment {

    private static final String TAG = "TaskInputFragment";
    private EditText editTextTaskName;
    private EditText editTextTaskDescription;
    private OnTaskAddedListener listener;

    public interface OnTaskAddedListener {
        void onTaskAdded(Task task);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnTaskAddedListener) {
            listener = (OnTaskAddedListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnTaskAddedListener");
        }
        Log.d(TAG, "onAttach");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task_input, container, false);

        editTextTaskName = view.findViewById(R.id.editTextTaskName);
        editTextTaskDescription = view.findViewById(R.id.editTextTaskDescription);
        Button buttonSaveTask = view.findViewById(R.id.buttonSaveTask);

        buttonSaveTask.setOnClickListener(v -> saveTask());

        Log.d(TAG, "onCreateView");
        return view;
    }

    private void saveTask() {
        String taskName = editTextTaskName.getText().toString().trim();
        String taskDescription = editTextTaskDescription.getText().toString().trim();

        if (!taskName.isEmpty()) {
            Task newTask = new Task(taskName);
            newTask.setDescription(taskDescription);
            listener.onTaskAdded(newTask);
            dismiss();
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
        Log.d(TAG, "onDetach");
    }
}