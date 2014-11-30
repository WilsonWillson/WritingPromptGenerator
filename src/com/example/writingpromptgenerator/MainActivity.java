package com.example.writingpromptgenerator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

//Code based off tutorial from http://pulse7.net/android/android-spinner-dropdown-list-example/
public class MainActivity extends ActionBarActivity {
	
	  	Spinner spSetting;
	    Spinner spSubject;
	    Spinner spConflict;
	    
	 
	    // Data Source
	    String subject[] = { "Automobile", "Food", "Computers", "Education",
	            "Personal", "Travel" };
	    String conflict[] = { "War", "Horror", "Conflict"};
	    // Adapter
	    ArrayAdapter<String> adapterSubject;
	    ArrayAdapter<String> adapterConflict;
	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
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
	
}
