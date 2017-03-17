package com.example.forcequit.activity;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

import com.example.forcequit.R;
import com.example.forcequit.base.BaseActivity;

public class MainActivity extends BaseActivity {

	EditText editText1, editText2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);


		findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(editText1.length() == 0){
					editText1.setError("名字不能为空");
				}else if(editText2.length() == 0){
					editText2.setError("密码不能为空");
				}else{
					startActivity(new Intent(MainActivity.this,FriendListActivity.class));
				}

			}
		});
		findViewById(R.id.button2).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
				builder.setMessage("dd");
				builder.setTitle("头文件");
				builder.setNeutralButton("确定", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialogInterface, int i) {

					}
				});
				builder.create().show();
			}
		});
	}


}
