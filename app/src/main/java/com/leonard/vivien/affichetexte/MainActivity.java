package com.leonard.vivien.affichetexte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.pm.ApplicationInfo;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    TextView str=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String app_name = getResources().getString(R.string.app_name);
        str=(TextView) findViewById(R.id.field);
        str.setText(app_name);
    }


}
