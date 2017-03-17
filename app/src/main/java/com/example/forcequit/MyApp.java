package com.example.forcequit;

import java.util.ArrayList;

import android.app.Activity;

public class MyApp {

	static ArrayList<Activity> activityList = new ArrayList<Activity>();

	/**
	 * 向链表中添加一个activity引用
	 * @param activity
	 */
	public static void addActivity(Activity activity){
		activityList.add(activity);
	}

	/**
	 * 销毁已打开的activity
	 */
	public static void finishAllActivity(){
		for (int i = 0; i < activityList.size(); i++) {
			Activity activity = activityList.get(i);
			activity.finish();
		}
	}

	public static void removeActivity(Activity activity){
		activityList.remove(activity);
	}


}
