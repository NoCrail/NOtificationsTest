package com.home.nomet.notificationstest;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.widget.Toast;

/**
 * Created by Nomet on 25.06.2017.
 */

public class NotificationListener extends
        NotificationListenerService {
    //private NLServiceReceiver nlservicereciver;
    @Override
    public void onNotificationPosted(
            StatusBarNotification sbn) {
        String a = String.valueOf(this.getActiveNotifications());
        Toast.makeText(this, a, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNotificationRemoved(
            StatusBarNotification sbn) {

    }
    class NotificationReciver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {

        }


    }
}




