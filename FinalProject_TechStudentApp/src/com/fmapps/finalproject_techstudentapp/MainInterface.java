package com.fmapps.finalproject_techstudentapp;


import com.fmapps.finalproject_techstudentapp.MusicService.MyLocalBinder;








import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;
import android.os.IBinder;

public class MainInterface extends Activity {
	AnimationDrawable studyAnimation;
	AnimationDrawable quizAnimation;
	AnimationDrawable otherAnimation;
	MusicService myService;
	
	Integer[] coursesIcons = { R.drawable.studyicon, R.drawable.quizicon, R.drawable.abouticon};
	Integer[] courses = { R.drawable.studytitle, R.drawable.quiztitle, R.drawable.abouttitle};

	ImageView img;
	
	
	
	 boolean isBound = false;
	 int imageClicked=0;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.maininterface);
	
	
	final Intent intent = new Intent(this, MusicService.class);
	        bindService(intent, myConnection, Context.BIND_AUTO_CREATE);
	final ImageView imgSound = (ImageView) findViewById(R.id.imgMusic);
	
	imgSound.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
	
		if(isBound){
			unbindService(myConnection);
			imgSound.setImageResource(R.drawable.soundoff);
			isBound=false;// TODO Auto-generated method stub
		}
		else{
			bindService(intent, myConnection, Context.BIND_AUTO_CREATE);
			imgSound.setImageResource(R.drawable.soundon);
			isBound=true;
		}
			
		}
	});
	
	
	
	
    //imgFrameStudy.setBackgroundResource(R.drawable.img1_animation);
   // imgFrameQuiz.setBackgroundResource(R.drawable.img2_animation);
    //imgFrameOther.setBackgroundResource(R.drawable.img3_animation);
   // studyAnimation = (AnimationDrawable)imgFrameStudy.getBackground();
   // quizAnimation = (AnimationDrawable)imgFrameQuiz.getBackground();
   // otherAnimation = (AnimationDrawable)imgFrameOther.getBackground();
   
    
	
	
	
	
	
	
	
	Gallery ga = (Gallery)findViewById(R.id.gallery1);
	img = (ImageView) findViewById(R.id.imgBook);
	ga.setAdapter(new ImageAdapter(this));
	ga.setOnItemClickListener(new OnItemClickListener() {
		public void onItemClick(AdapterView<?> arg0,
		View arg1, int arg2, long arg3) {
		
			imageClicked=arg2;
			img.setImageResource(courses[arg2]);
		
			
		}
		});
	
	img.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		
			switch(imageClicked){
		case 0:
			startActivity(new Intent(MainInterface.this, StudyCourses.class));
			break;
		case 1:
			startActivity(new Intent(MainInterface.this, Quiz.class));
			break;
		case 2:
			startActivity(new Intent(MainInterface.this, About.class));
			break;// TODO Auto-generated method stub
		}
			
		}
	});
}
public class ImageAdapter extends BaseAdapter {
	private Context context;
	public ImageAdapter(Context c) {
		context = c;	// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return courses.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		ImageView pic = new ImageView(context);
		pic.setImageResource(coursesIcons[arg0]);
		pic.setScaleType(ImageView.ScaleType.FIT_XY);
		pic.setLayoutParams(new Gallery.LayoutParams(200,175));
		// TODO Auto-generated method stub
		return pic;
	}
		
	}
	 

		
   /* handler.postDelayed(new Runnable(){

    public void run(){
    	//studyAnimation.start();
    	//quizAnimation.start();
    	//otherAnimation.start();
    
    }
    }, 1000);   */
    
   
    
 

	    
	       
	    
	     

private ServiceConnection myConnection = new ServiceConnection() {

    public void onServiceConnected(ComponentName className, IBinder service) {
        MyLocalBinder binder = (MyLocalBinder) service;
        myService = binder.getService();
        isBound = true;
    }
    
    public void onServiceDisconnected(ComponentName arg0) {
        isBound = false;
    }
    
   };  



}
