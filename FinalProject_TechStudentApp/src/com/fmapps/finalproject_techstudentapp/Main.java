package com.fmapps.finalproject_techstudentapp;

import java.util.Timer;
import java.util.TimerTask;



import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;


import android.view.animation.Animation;

import android.view.animation.AnimationUtils;

import android.widget.ImageView;


public class Main extends Activity {
	Animation logoMoveAnimation;
	ImageView studentAnim;
	ImageView techAnim;
	ImageView guideAnim, penAnim, pencilAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MediaPlayer player;
        player= MediaPlayer.create(this, R.raw.electro);
                   
        studentAnim = (ImageView)findViewById(R.id.imgStudent);
        techAnim = (ImageView)findViewById(R.id.imgTech);
        guideAnim = (ImageView)findViewById(R.id.imgGuide);
        penAnim = (ImageView)findViewById(R.id.imgPen);
        pencilAnim = (ImageView)findViewById(R.id.imgPencil);
        penAnim.startAnimation(AnimationUtils.loadAnimation(this, R.anim.pentranslation));
        pencilAnim.startAnimation(AnimationUtils.loadAnimation(this, R.anim.penciltranslation));
        studentAnim.startAnimation(AnimationUtils.loadAnimation(this, R.anim.studenttranslation));
        techAnim.startAnimation(AnimationUtils.loadAnimation(this, R.anim.techtranslation));
        guideAnim.startAnimation(AnimationUtils.loadAnimation(this, R.anim.guidetranslation));
        player.start();
        TimerTask timer = new TimerTask() {

			@Override
			public void run() {
				
				
				startActivity(new Intent(Main.this, MainInterface.class));	// TODO Auto-generated method stub
				Main.this.finish();
			}
        	
        };
        
        
        
        Timer opening = new Timer();
        opening.schedule(timer, 5000);
        
    }  
    
    
   
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.grpQuiz) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // .
        // Add code if needed
        // .
    }
}
