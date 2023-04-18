package edu.uw.tcss450.nzhuk.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Debug Log");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "Debug Log");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Info Log");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.w(TAG, "Warn Log");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "Verbose Log");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "Error Log");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG, "Error Log");
        super.onRestart();
    }
}