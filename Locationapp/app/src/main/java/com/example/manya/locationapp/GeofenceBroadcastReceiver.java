package com.example.manya.locationapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Manya on 27/06/2017.
 */

public class GeofenceBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = GeofenceBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG,"broadcast received");

    }
}
