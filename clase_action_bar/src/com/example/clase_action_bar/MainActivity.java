package com.example.clase_action_bar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar barra = getActionBar();
		//barra.setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.info:
			Toast.makeText(this, "click en info", Toast.LENGTH_LONG).show();
			break;
		case R.id.grabar:
			Toast.makeText(this, "click en grabar", Toast.LENGTH_LONG).show();
			break;
		}		
		return super.onOptionsItemSelected(item);
	}

}
