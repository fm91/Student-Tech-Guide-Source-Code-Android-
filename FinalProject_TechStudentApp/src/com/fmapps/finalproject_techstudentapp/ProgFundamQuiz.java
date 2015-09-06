package com.fmapps.finalproject_techstudentapp;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListActivity;


public class ProgFundamQuiz extends ListActivity {
	Intent iQ;
	final int result = 1;
	
	
	
    String [] quizList = {"Chapter 1-4", "Chapter 4-8", 
			"Chapter 8-11"}; 
     

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		iQ = new Intent(this,QuizContent.class);
		ListView listView = getListView();
		listView.setBackgroundResource(R.drawable.background);     
		setListAdapter(new ArrayAdapter<String>(this,
				R.layout.listview,R.id.travel, quizList));
		
	}
	
	
	protected void onListItemClick(ListView l, View v, int position, long id){
	
		switch(position){
		
		case 0:   // CH1-4
			iQ.putExtra("stringkey2","314");
			startActivityForResult(iQ, result);
			break;  
		
		case 1:   //  CH4-8
			iQ.putExtra("stringkey2","348");
			startActivityForResult(iQ, result);
			break;
		case 2:   // CH8-11
			iQ.putExtra("stringkey2","381");
			startActivityForResult(iQ, result);
			break;
		
		}  
}
	
	 
}
