package com.example.administrator.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String TAG = "Activity2";
//    TextView textView;
    ListView listView;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_listview);
        Log.i(TAG,"onCreate");

//        textView = findViewById(R.id.textView);
        listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("Amazon");
        adapter.add("Flipkart");
        adapter.add("Snapdeal");
        adapter.add("Myntra");
        adapter.add("eBay");
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
        String item = adapter.getItem(i);
        Toast.makeText(this,"You selected: "+item,Toast.LENGTH_LONG).show();

        Intent intent = new Intent(MainActivity2.this,act2.class);
        startActivity(intent);
    }

/*    public void clickHandler(View view){
        Date date = new Date();
        textView.setText("Today is: "+date.toString());
        Toast.makeText(this,"u clicked button",Toast.LENGTH_LONG).show();
    }*/
}
