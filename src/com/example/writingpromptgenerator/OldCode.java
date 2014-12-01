package com.example.writingpromptgenerator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Intent;
import android.util.Log;
import android.widget.AdapterView.OnItemSelectedListener;

public class OldCode {
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
  	Spinner spSetting;
    Spinner spSubject;
    Spinner spConflict;
    private Button btnSend;
    private static final String TAG = "MyLogs";
    // Data Source
    String subject[] = { "Hero", "Villian", "Computers" };
    String conflict[] = { "War", "Horror", "Conflict"};
    // Adapter
    ArrayAdapter<String> adapterSubject;
    ArrayAdapter<String> adapterConflict;
    
protected void onCreate(Bundle savedInstanceState) {
/*	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

    // Initialize Spinners

    spSetting = (Spinner) findViewById(R.id.spSetting);
    spSubject = (Spinner) findViewById(R.id.spSubject);
    spConflict = (Spinner) findViewById(R.id.spConflict);

    // Initialize and set Adapter
    adapterSubject = new ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_item, subject);
    spSubject.setAdapter(adapterSubject);
    
    adapterConflict = new ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_item, conflict);
    spConflict.setAdapter(adapterConflict);
    
    //Creating  submit button
    btnSend = (Button) findViewById(R.id.button_send);

    // Setting Item Selected Listener
    spSetting.setOnItemSelectedListener(new OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> adapter, View v,
                int position, long id) {
            // On selecting a spinner item
            String item = adapter.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(getApplicationContext(),
                    "Selected Setting: " + item, Toast.LENGTH_LONG).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

        }
    });
    // Subject Item Selected Listener
    spSubject.setOnItemSelectedListener(new OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> adapter, View v,
                int position, long id) {
            // On selecting a spinner item
            String item = adapter.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(getApplicationContext(),
                    "Subject : " + item, Toast.LENGTH_LONG).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

        }
    });
    
    spConflict.setOnItemSelectedListener(new OnItemSelectedListener() {
    	 
        @Override
        public void onItemSelected(AdapterView<?> adapter, View v,
                int position, long id) {
            // On selecting a spinner item
            String item = adapter.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(getApplicationContext(),
                    "Conflict : " + item, Toast.LENGTH_LONG).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

        }
    });
    */
}
}
