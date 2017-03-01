package com.example.yvtc.yvd030103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView tv;
        tv = (TextView) findViewById(R.id.textView3);


        Intent it = getIntent();
        Bundle b = it.getExtras();
        String m = b.getString("msg");
        tv.setText(m);
    }
}
