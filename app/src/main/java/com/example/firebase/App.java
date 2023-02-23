package com.example.firebase;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;

public class App extends Application {
    @SuppressLint("SuspiciousIndentation")
    @Override
    public void onCreate() {
        super.onCreate();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel("myapp","def",NotificationManager.IMPORTANCE_HIGH);
        notificationChannel.setDescription("this is for test");
        if (notificationManager!=null)
        notificationManager.createNotificationChannel(notificationChannel);

        }

    }
}