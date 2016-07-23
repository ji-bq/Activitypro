package com.example.lsx.newcaptivity;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activitylife extends AppCompatActivity {
    private static final String TAG = "Activitylife";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylife);
        Log.d(TAG, "onCreate:oncreate开始执行了 ");
        Button dial= (Button) findViewById(R.id.activity_activitylife_button);
        final EditText editText = (EditText) findViewById(R.id.edit_info);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activitylife.this,ActivitySecond.class);
                intent.putExtra("name",editText.getText().toString().trim());
               startActivity(intent);
                //Toast.makeText(Activitylife.this, "You clicked The Button!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: onstart开始执行了 ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: onrestart开始执行了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: onstop开始执行了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: onpause开始执行了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 开始执行了");
    }

}

