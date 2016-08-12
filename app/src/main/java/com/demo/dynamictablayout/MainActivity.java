package com.demo.dynamictablayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String KEY_COMMIT = "commit";

    private int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void method() {
        //Created by programmer 2
    }

    private void methodmaster() {
//        created by master
        //update by programer in master method
        //othe update by programmer
//update by master
    }

    private void developmentbranch() {
//        created at development
        // updaed by master
        //master
        //change by programmer 2
    }

    private void programer2() {
        //master made changes

    }
//programmer commented

// demo discuss with bhavik
}
