package com.home.nomet.notificationstest;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView txtView;
    private NotificationReciver nReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nReceiver = new NotificationReciver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.home.nomet.notificationstest.NOTIFICATION_LISTENER_EXAMPLE");
        registerReceiver(nReceiver, filter);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(nReceiver);

    }
}