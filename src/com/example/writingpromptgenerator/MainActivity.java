package com.example.writingpromptgenerator;


import java.util.ArrayList;
import java.util.List;

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
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Intent;
import android.util.Log;
import android.widget.AdapterView.OnItemSelectedListener;


//Code based off tutorial from http://www.mkyong.com/android/android-spinner-drop-down-list-example/
public class MainActivity extends ActionBarActivity {
	   public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	  	Spinner spSetting;
	    Spinner spSubject;
	    Spinner spConflict;
	    private Button btnSend;

	    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	 
		//addItemsOnSpinner2();
		addListenerOnButton();
		addListenerOnSpinnerItemSelection();
	}
	
	 public void addItemsOnSpinner2() {
		 
			spSubject = (Spinner) findViewById(R.id.spSubject);
			List<String> list = new ArrayList<String>();
			list.add("Villian");
			list.add("Hero");
			list.add("Subject");
			ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
			dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spSubject.setAdapter(dataAdapter);
		  }
		 
		  public void addListenerOnSpinnerItemSelection() {
			spSetting = (Spinner) findViewById(R.id.spSetting);
			spSetting.setOnItemSelectedListener(new CustomOnItemSelectedListener());
		  }
		  
        // get the selected dropdown list value
        public void addListenerOnButton() {
       
        spSetting = (Spinner) findViewById(R.id.spSetting);
      	spSubject = (Spinner) findViewById(R.id.spSubject);
      	spConflict = (Spinner) findViewById(R.id.spConflict);
        btnSend = (Button) findViewById(R.id.button_send);
       
        btnSend.setOnClickListener(new OnClickListener() {
       
      	  @Override
      	  public void onClick(View v) {
       
      	    Toast.makeText(MainActivity.this,
      		"User Choices : " + 
                      "\nSetting : "+ String.valueOf(spSetting.getSelectedItem()) + 
                      "\nSubject: "+ String.valueOf(spSubject.getSelectedItem()) +  
                      "\nConflict: "+ String.valueOf(spConflict.getSelectedItem()),
      			Toast.LENGTH_SHORT).show();
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
	
	public void sendMessage(AdapterView<?> adapter, View v,
            int position, long id) {
	    // Do something in response to button
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		Spinner editText = (Spinner) findViewById(R.id.spSetting);
		String message = editText.getItemAtPosition(position).toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		 startActivity(intent);
	}
}