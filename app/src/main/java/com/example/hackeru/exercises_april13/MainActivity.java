package com.example.hackeru.exercises_april13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    public static final String USER_1 = "USER_1";
    public static final String INT_1 = "INT_1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void btnOnClick(View view){
        Intent intent = new Intent(this, Sec_Activity.class);
        Bundle extras = new Bundle();
        extras.putString(USER_1,"Bryan's App");
        extras.putInt(INT_1, 25);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
