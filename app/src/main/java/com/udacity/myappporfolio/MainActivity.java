package com.udacity.myappporfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	final private static String[] button_names = {
			"Spotify Streamer", "Scores App", "Library App", "Build It Bigger", "XYZ Reader", "Capstone: My Own App"
	};
	final private static int[] button_ids = {
			R.id.button01, R.id.button02, R.id.button03, R.id.button04, R.id.button05, R.id.button06
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		for( int i=0; i<button_names.length; i++) {
			final String button_name = button_names[i];
			Button button = (Button) findViewById(button_ids[i]);
			//button.setText(button_names[i].toUpperCase());
			button.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Toast.makeText( MainActivity.this, "This button will launch " + button_name + "!", Toast.LENGTH_SHORT).show();
				}
			});
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
