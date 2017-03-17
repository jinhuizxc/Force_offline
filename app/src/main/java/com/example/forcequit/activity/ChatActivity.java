package com.example.forcequit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.forcequit.R;
import com.example.forcequit.base.BaseActivity;

public class ChatActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chat);
		findViewById(R.id.bt1).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//启动广播
				sendBroadcast(new Intent("com.example.forcequit.ForceQuitReceiver"));

			}
		});
	}
}