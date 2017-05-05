package com.example.holmesk.clock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.holmesk.clock.utils.MyUtil;

public class MainActivity extends AppCompatActivity {

    private TextView my_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        my_tv = (TextView) findViewById(R.id.my_tv);

        my_tv.setText(MyUtil.getWeek());
        my_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("time", MyUtil.getSysDate() + MyUtil.getWeek());
                startActivity(intent);
            }
        });
    }
}
