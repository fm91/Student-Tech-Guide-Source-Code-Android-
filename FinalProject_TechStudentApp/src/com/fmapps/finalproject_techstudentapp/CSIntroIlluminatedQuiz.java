package com.fmapps.finalproject_techstudentapp;




import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListActivity;

public class CSIntroIlluminatedQuiz extends ListActivity {
	Intent iQ;
	final int result = 1;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		ListView listView = getListView();
		listView.setBackgroundResource(R.drawable.background);
		
		
        iQ = new Intent(this,QuizContent.class);
		
		String [] quizList = {"Chapter 1", "Chapter 2", 
				"Chapter 3", "Chapter 4", "Chapter 5", "Chapter 6 & 7",
				"Chapter 8", "Chapter 9", "Chapter 10", "Chapter 13", "Chapter 14", "Chapter 15", "Chapter 16", "Chapter 17" }; 
		
		setListAdapter(new ArrayAdapter<String>(this,
				R.layout.listview,R.id.travel, quizList));
	
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id){
	
		switch(position){
		
		case 0:   // CH1
			iQ.putExtra("stringkey2","1");
			startActivityForResult(iQ, result);
			break;  
		
		case 1:   //  CH2
			iQ.putExtra("stringkey2","2");
			startActivityForResult(iQ, result);
			break;
		case 2:   // CH3
			iQ.putExtra("stringkey2","3");
			startActivityForResult(iQ, result);
			break;
		case 3:   //  CH4
			iQ.putExtra("stringkey2","4");
			startActivityForResult(iQ, result);
			break;
		case 4:   //  CH5
			iQ.putExtra("stringkey2","5");
			startActivityForResult(iQ, result);
			break;
		case 5:   //  CH6&7
			iQ.putExtra("stringkey2","67");
			startActivityForResult(iQ, result);
			break;
		case 6:  // CH8
			iQ.putExtra("stringkey2","8");
			startActivityForResult(iQ, result);
			break;
		case 7:   //  CH9
			iQ.putExtra("stringkey2","9");
			startActivityForResult(iQ, result);
			break;
		case 8:   //  CH10
			iQ.putExtra("stringkey2","10");
			startActivityForResult(iQ, result);
			break;
		case 9:   //  CH13
			iQ.putExtra("stringkey2","13");
			startActivityForResult(iQ, result);
			break;
		case 10:   //  CH14
			iQ.putExtra("stringkey2","14");
			startActivityForResult(iQ, result);
			break;
		case 11:   //  CH15
			iQ.putExtra("stringkey2","15");
			startActivityForResult(iQ, result);
			break;
		case 12:   //  CH16
			iQ.putExtra("stringkey2","16");
			startActivityForResult(iQ, result);
			break;
		case 13:   //  CH17
			iQ.putExtra("stringkey2","17");
			startActivityForResult(iQ, result);
			break;
		
		}  

}
}
