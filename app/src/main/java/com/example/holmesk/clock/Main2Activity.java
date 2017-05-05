package com.example.holmesk.clock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView showtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        showtime = (TextView) findViewById(R.id.showtime);

        Intent intent = getIntent();
        String time = intent.getStringExtra("time");
        showtime.setText("现在是" + time);
    }
}
