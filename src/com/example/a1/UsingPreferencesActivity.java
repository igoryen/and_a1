package com.example.a1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UsingPreferencesActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void onClickLoad(View view) {
		Intent i = new Intent("com.example.a1.AppPreferenceActivity");
		startActivity(i);
	}
}