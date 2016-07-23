package com.example.lsx.newcaptivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by lsx on 2016/7/22.
 */
public class ActivitySecond extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String information=getIntent().getStringExtra("name");
        Toast.makeText(ActivitySecond.this, "information", Toast.LENGTH_SHORT).show();

    }
}

