package com.fmapps.finalproject_techstudentapp;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class FinalScore extends Activity {
	int total;

@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
    setContentView(R.layout.finalscore);
   
    Bundle iReceive = getIntent().getExtras();  // receives a value passed from another Activity
	if(iReceive!=null)
	total = iReceive.getInt("finalScoreKey");
	
	Typeface font = Typeface.createFromAsset(getAssets(), "asongforjennifer.ttf");
	TextView txtFinal = (TextView) findViewById(R.id.txtSrchRslt);
	txtFinal.setTypeface(font);
	txtFinal.setText("Final Score:\n"+total+"/100");
}
}
