package com.fmapps.finalproject_techstudentapp;




import android.content.Intent;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListActivity;

public class PSAliceQuiz extends ListActivity {
	Intent iQ;
	final int result = 1;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ListView listView = getListView();
		listView.setBackgroundResource(R.drawable.background);
		iQ = new Intent(this,QuizContent.class);
		
        String [] quizList = {"Chapter 1-3", "Chapter 4", 
				"Chapter 5", "Chapter 6", "Chapter 7", "Chapter 8"}; 
       
        setListAdapter(new ArrayAdapter<String>(this,
				R.layout.listview,R.id.travel, quizList));
	
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id){
	
		switch(position){
		
		case 0:   // CH1-3
			iQ.putExtra("stringkey2","213");
			startActivityForResult(iQ, result);
			break;  
		
		case 1:   //  CH4
			iQ.putExtra("stringkey2","24");
			startActivityForResult(iQ, result);
			break;
		case 2:   // CH5
			iQ.putExtra("stringkey2","25");
			startActivityForResult(iQ, result);
			break;
		case 3:   //  CH6
			iQ.putExtra("stringkey2","26");
			startActivityForResult(iQ, result);
			break;
		case 4:   //  CH7
			iQ.putExtra("stringkey2","27");
			startActivityForResult(iQ, result);
			break;
		case 5:   //  CH8
			iQ.putExtra("stringkey2","28");
			startActivityForResult(iQ, result);
			break;
		
		
		
		
		}  

}
}
