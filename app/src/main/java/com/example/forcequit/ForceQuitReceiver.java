package com.example.forcequit;




import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;

import com.example.forcequit.activity.MainActivity;

/**
 * @author Administrator
 * 接收强制下线广播
 */
public class ForceQuitReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, Intent intent) {
		//弹出对话框
		Log.d("Tag", "收到广播，弹出对话框");



		Builder builder = new Builder(context);
		builder.setTitle("下线");
		builder.setMessage("系统强制下线");

		//设置对话框不能取消
		builder.setCancelable(false);

		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {

				//销毁掉当前应用中已经打开的所有activity
				MyApp.finishAllActivity();

				//再次打开登录界面
				Intent intent = new Intent(context, MainActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				context.startActivity(intent);

			}
		});

		AlertDialog dialog = builder.create();
		dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		dialog.show();

	}

}

