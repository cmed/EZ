package com.med.ezzouggari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"ACTIVITEE EST CREEE",Toast.LENGTH_SHORT).show();
        Log.i("OnCreate():","ACTIVITEE EST CREEE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"ACTIVITEE EST DEMARREE",Toast.LENGTH_SHORT).show();
        Log.i("onStart():","ACTIVITEE EST DEMARREE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"ACTIVITEE EST STOPPEE",Toast.LENGTH_SHORT).show();
        Log.i("onStop():","ACTIVITEE EST STOPPEE");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"ACTIVITEE EST DETRUITE",Toast.LENGTH_SHORT).show();
        Log.i("onDestroy():","ACTIVITEE EST DETRUITE");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"ACTIVITEE EST EN PAUSE",Toast.LENGTH_SHORT).show();
        Log.i("onPause:","ACTIVITEE EST EN PAUSE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"ACTIVITEE EST REPRISE",Toast.LENGTH_SHORT).show();
        Log.i("onResume():","ACTIVITEE EST DEMARREE");
    }
}