package com.example.raytseng.eventcheckin.search.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.raytseng.eventcheckin.R;

public class SearchNameActivity extends ActionBarActivity {


    private final String TAG = "SearchNameActivity";

    private RadioGroup radioGroup;
    private RadioButton radBtnBoy;
    private RadioButton radBtnGirl;
    private EditText guestName;
    private Button mySubmitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_name);

        ActionBar myActionBar = getSupportActionBar();
        myActionBar.setTitle(R.string.main_feature);

        initUIComponent();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_name, menu);
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
        radioGroup = (RadioGroup) findViewById(R.id.rad_group_b_or_g);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, final int checkedId) {
                switch (checkedId) {
                    case R.id.rad_btn_boy:
                        //do something
                        break;
                    case R.id.rad_btn_girl:
                        //do something
                        break;
                }
            }

        });


        guestName = (EditText) findViewById(R.id.ed_guest_name_input);


        radBtnBoy = (RadioButton) findViewById(R.id.rad_btn_boy);
        radBtnGirl = (RadioButton) findViewById(R.id.rad_btn_girl);


        mySubmitBtn = (Button) findViewById(R.id.btn_search_on_server);
        mySubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int friendType;

                if (radBtnBoy.isChecked()) {
                    friendType = 0;
                } else {
                    friendType = 1;
                }

                String name = guestName.getText().toString();
                Log.i(TAG, "Friend Type: " + friendType + "  Guest Name: " + name);

                // TODO -- send guest name, friend type to server

            }
        });

    }

}
