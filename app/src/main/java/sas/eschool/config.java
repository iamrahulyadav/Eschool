package sas.eschool;

import android.app.Application;

import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by CodeCrazy on 12/15/17.
 */

public class config extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseMessaging.getInstance().subscribeToTopic("chat");
    }
}
