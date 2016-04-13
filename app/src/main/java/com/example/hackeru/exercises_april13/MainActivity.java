package com.example.hackeru.exercises_april13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void btnOnClick(){
        Intent intent = new Intent(this, Sec_Activity.class);
        startActivity(intent);
    }
}
