package com.example.czaszyciaaplikacji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer punkty=0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tekstPunkty);
        Log.d("czas_zycia","wywolana metoda onCreate");
        if(savedInstanceState != null){
            punkty=savedInstanceState.getInt("NaszePunkty");
            textView.setText(punkty.toString());
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("czas_zycia", "wywołana onSaveInstanceState");
        outState.putInt("NaszePunkty",punkty);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("czas_zycia","wywolana metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("czas_zycia","wywolana metoda onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("czas_zycia","wywolana metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("czas_zycia","wywolana metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("czas_zycia","wywolana metoda onDestroy");
    }

    public void wgore(View view) {
        punkty++;
        textView.setText(punkty.toString());
    }

    public void wdol(View view) {
        punkty--;
        textView.setText(punkty.toString());
    }
}