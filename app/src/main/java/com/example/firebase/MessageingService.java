package com.example.firebase;

import android.app.Notification;
import android.app.NotificationManager;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessageingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);

        if (message.getNotification() == null)
            return;
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification notification =new NotificationCompat.Builder(this,"myapp")
                .setContentTitle(message.getNotification().getTitle())
                .setContentText(message.getNotification().getBody())
                .build();
notificationManager.notify(100,notification);


    }
}
