package com.example.forcequit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.forcequit.R;
import com.example.forcequit.base.BaseActivity;

public class FriendListActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.friendlist);

		findViewById(R.id.btn1).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(FriendListActivity.this,
						ChatActivity.class));
			}
		});
	}
}
