package com.fmapps.finalproject_techstudentapp;



import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.media.MediaPlayer;


public class MusicService extends Service {
    
    MediaPlayer player;
    private final IBinder myBinder = new MyLocalBinder();
    
   
    public IBinder onBind(Intent arg0) {
       player.start();
        return myBinder;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.nicesound);
        player.setLooping(true); // Set looping
        

    }
    @Override
    public void onDestroy() {
        player.stop();
        player.release();
    }

    @Override
    public void onLowMemory() {

    }
    public class MyLocalBinder extends Binder {
        MusicService getService() {
            return MusicService.this;
        }
        
    
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return 1;
    }

    public void onStart(Intent intent, int startId) {
        // TO DO
    }
    public IBinder onUnBind(Intent arg0) {
      player.stop();  // TO DO Auto-generated method
        return null;
    }

    public void onStop() {

    }
    public void onPause() {

    }
    
}
}

