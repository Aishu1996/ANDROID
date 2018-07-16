package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class otherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Toast.makeText(this, "Landed in other activity", Toast.LENGTH_SHORT).show();

        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("KEY");

        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
