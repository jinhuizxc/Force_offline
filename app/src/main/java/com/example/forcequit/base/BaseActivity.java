package com.example.forcequit.base;

import android.app.Activity;
import android.os.Bundle;

import com.example.forcequit.MyApp;

public class BaseActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		MyApp.addActivity(this);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		MyApp.removeActivity(this);
	}
}
