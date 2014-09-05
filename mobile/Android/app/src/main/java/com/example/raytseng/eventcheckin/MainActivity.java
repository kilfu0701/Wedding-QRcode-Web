package com.example.raytseng.eventcheckin;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.raytseng.eventcheckin.search.ui.SearchNameActivity;

public class MainActivity extends ActionBarActivity {


    private final String TAG = "MainActivity";

    private Button btnSearchQR;
    private Button btnSearchName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar myActionBar = getSupportActionBar();
        myActionBar.setTitle(R.string.main_feature);

        initUIComponent();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Init main ui component
     * */
    public void initUIComponent() {

        btnSearchQR = (Button) findViewById(R.id.btn_search_qrcode);
        btnSearchQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO -- start qrcode scan activity


            }
        });


        btnSearchName = (Button) findViewById(R.id.btn_search_name);
        btnSearchName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // start search name activity
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SearchNameActivity.class);
                startActivity(intent);

            }
        });

    }
}
