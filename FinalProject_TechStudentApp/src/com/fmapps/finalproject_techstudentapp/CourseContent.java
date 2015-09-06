package com.fmapps.finalproject_techstudentapp;





import android.app.Activity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CourseContent extends Activity {
	String origString, textToHighlight,changedString;
	EditText txtSearch;
	int totalreplaced=0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.coursecontent);
		final TextView txtOut = (TextView)findViewById(R.id.txtContent);
		final TextView txtSrchRslt = (TextView)findViewById(R.id.txtSrchRslt);
		Typeface font = Typeface.createFromAsset(getAssets(), "asongforjennifer.ttf");
		txtOut.setTypeface(font);
		txtSrchRslt.setTypeface(font);
		Bundle iReceive = getIntent().getExtras();
		if(iReceive!=null)
		txtOut.setText(iReceive.getString("stringkey"));
		Button btSearch = (Button) findViewById(R.id.btnSearch);
		origString = txtOut.getText().toString();
		
        txtSearch = (EditText) findViewById(R.id.editSearch);
        
         txtOut.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
				imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);	// TODO Auto-generated method stub
				
			}
		});{
			
		}
		btSearch.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				totalreplaced=0;
				textToHighlight = txtSearch.getText().toString();
				if(textToHighlight.replaceAll(" ", "").length()== 0 ){}
				else{
					
					changedString = origString;
				 
				    while(!changedString.replaceFirst("(?i)"+textToHighlight, "_").equals(changedString)) {
					    changedString = changedString.replaceFirst("(?i)"+textToHighlight, "_");
					    totalreplaced++;
					}

				   changedString = origString.replaceAll("(?i)"+"\n", "<br>");
					changedString = changedString.replaceAll("(?i)"+textToHighlight,"<font color='yellow'>"+textToHighlight.toUpperCase()+"</font>");
                   txtOut.setText(Html.fromHtml(changedString));
                    // TODO Auto-generated method stub
				}	
				txtSrchRslt.setText(""+totalreplaced+" result(s) found");
				txtSrchRslt.setTextColor(Color.YELLOW);
			}
		});
		
	   
		
	}
}


