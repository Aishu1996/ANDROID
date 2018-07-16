package com.example.administrator.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button dialNumber,toast,showLocation,openWebPage,viewIntent,LetsGetPro;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  TextView textView;
        textView = (TextView) findViewById(R.id.textView);
        dialNumber = (Button) findViewById(R.id.dialNumber);
         toast = (Button) findViewById(R.id.toast);
         showLocation = (Button) findViewById(R.id.showLocation);
        openWebPage = (Button) findViewById(R.id.openWebPage);
        viewIntent = (Button) findViewById(R.id.viewIntent);
        LetsGetPro = (Button) findViewById(R.id.LetsGetPro);


        dialNumber.setOnClickListener(this);
         toast.setOnClickListener(this);
        showLocation.setOnClickListener(this);
        openWebPage.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        LetsGetPro.setOnClickListener(this);
        //Event listener

      /*  push_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag","some body pushed the button");
                textView.setText("Some body pushed the button");
            }
        });

        click_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("tag","hey you clicked the button");
                textView.setText("hey you clicked the button");
            }
        });  */
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "In onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag", "In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "In onDestroy");
    }

    //better approach...any number of buttons the control is going to come over here
    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.dialNumber :
              //  Log.d("tag","dial it");
               // textView.setText("dial it");
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"));
                startActivity(intent1);
                break;

            case R.id.toast :
                //Log.d("tag","toast karo");
                //textView.setText("toast karo");
                Intent intent = new Intent(MainActivity.this,otherActivity.class);
                startActivity(intent);
                break;


            case R.id.showLocation :
                //Log.d("tag","location batao");
                //textView.setText("location batao");
                //Even google maps is using Intent.ACTION_VIEW
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:18.993653, 73.115785"));
                startActivity(intent2);
                break;

            case R.id.openWebPage :
                //Log.d("tag","open it!");
               // textView.setText("open it!");
                //Even the browsers like chrome or..is using Intent.ACTION_VIEW
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.edureka.co"));
                startActivity(intent3);
                break;

            case R.id.viewIntent :
               // Log.d("tag","intent dekho");
               // textView.setText("intent dekho");
                Intent intent4 = new Intent(Intent.ACTION_VIEW);
                startActivity(intent4);
                break;

            case R.id.LetsGetPro :
                //Log.d("tag","yes I am!");
                //textView.setText("yes I am!");
               // Intent intent5 = new Intent("com.example.administrator.myapplication.otherActivity");
                //startActivity(intent5);
                Intent intent6 = new Intent(Intent.ACTION_VIEW);
                intent6.putExtra("KEY","Value is my data..");
                startActivity(intent6);
                break;
        }

    }
}
