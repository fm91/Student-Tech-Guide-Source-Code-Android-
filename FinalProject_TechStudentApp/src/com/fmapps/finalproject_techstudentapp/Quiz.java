package com.fmapps.finalproject_techstudentapp;




import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Quiz extends ListActivity {
	
	
	
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setTitle("Computer Information Technology");
	ListView listView = getListView();
	listView.setBackgroundResource(R.drawable.background);
	
	String [] courseListArray = {"Introduction to Computer Systems", "Problem Solving with Computer Programming", 
			"Programming Fundamentals"}; 
	/* future updates:
			"Databases Fundamentals", "Operating Systems Fundamentals",
			"Introduction to Information Systems and Technologies", "Mobile Device and Multimedia Programming"
			"Networking Fundamentals", "Web Programming I", "C++ Programming I", "System Administration (Windows)", 
			"Introduction to Systems Analysis and Design", "Web Programming II", "System Administration (Linux)", 
			"C++ Programming II", "Database Design", "Advanced Single LAN Concept", "Graphic User Interface", 
			"Computer Security", "Object Oriented Programming in Java", "XML Data Representation", "Object Oriented Programming",
			"Design of Distributed Databases", "Interconnectivity", "Distributed Application Processing", "Network Security",
			"Advanced Object Oriented Programming in Java", "Web Services", "Data Warehousing", "Software Development Methodologies", 
			"LAN Internet Connection", "ClientServer Technology", "Installing and Maintaining Web Servers", "Advanced Security Technology", 
			"Dynamic Web Development: Servlets and JSP", "Database Administration"*/
	
	setListAdapter(new ArrayAdapter<String>(this,
			R.layout.listview,R.id.travel, courseListArray));
	
	
}

protected void onListItemClick(ListView l, View v, int position, long id){
	
	switch(position){
	case 0:   // Introduction to Computer Systems
		startActivity(new Intent(this, CSIntroIlluminatedQuiz.class));
		break;  
	case 1:     //  Problem Solving with Computer Programming
		startActivity(new Intent(this, PSAliceQuiz.class));
		break;
	case 2:   //  Programming Fundamentals
		startActivity(new Intent(this, ProgFundamQuiz.class));
		break;
	case 3:   //  Databases Fundamentals
		break;
	case 4:   //  Operating Systems Fundamentals
		break;
	case 5:   //  Introduction to Information Systems and Technologies
		break;
	case 6:   // Mobile Device and Multimedia Programming 
		break;
	case 7:   // Networking Fundamentals 
		break;
	case 8:   //  Web Programming I
		break;
	case 9:   //  C++ Programming I
		break;
	case 10:   //  System Administration (Windows)
		break;
	case 11:   //  Introduction to Systems Analysis and Design
		break;
	case 12:   //  Web Programming II
		break;
	case 13:   //  System Administration (Linux)
		break;
	case 14:   //  C++ Programming II
		break;
	case 15:   //  Database Design
		break;
	case 16:   //  Advanced Single LAN Concept
		break;
	case 17:   //  Graphic User Interface
		break;
	case 18:   //  Computer Security
		break;
	case 19:   //  Object Oriented Programming in Java
		break;
	case 20:   //  XML Data Representation
		break;
	case 21:   // Object Oriented Programming 
		break;
	case 22:   // Design of Distributed Databases 
		break;
	case 23:   //  Interconnectivity
		break;
	case 24:   // Distributed Application Processing 
		break;
	case 25:   //  Network Security 
		break;
	case 26:   //  Advanced Object Oriented Programming in Java
		break;
	case 27:   //  Web Services
		break;
	case 28:   // Data Warehousing 
		break;
	case 29:   // Software Development Methodologies 
		break; 
	case 30:   //  LAN Internet Connection
		break;
	case 31:   //  ClientServer Technology 
		break;
	case 32:   //  Installing and Maintaining Web Servers
		break;
	case 33:   //  Advanced Security Technology
		break;
	case 34:  // Dynamic Web Development: Servlets and JSP
		break;
	case 35:  //  Database Administration
		break;
	}  
}

}
