package com.tabrej.android.alarmactivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MyPhoneReceiver extends BroadcastReceiver {
	private final String TAG = "MyPhoneReceiver";
	
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(TAG, "onReceive() is called");
		// TODO Auto-generated method stub
		Bundle extras = intent.getExtras();
	    if (extras != null) {
			String state = extras.getString(TelephonyManager.EXTRA_STATE);
			Log.i(TAG, state);
			
			if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
				String phoneNumber = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
				Log.i(TAG, phoneNumber);
			}
	    }
	}

}
