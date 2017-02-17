// Create Package for DTC Services MainScreen
package com.planner;
// Importing Android Packages
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

// Activity Class Starts
public class DtcServiceScreen extends Activity {
	
	Button _stopDetail, _RouteDetail, _Customercare; // Create Variables for button
	
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dtcservicescreen); // Calling layout Id
		// Calling ID's of buttons 
		_stopDetail = (Button)findViewById(R.id.DSbuttonstopdetail);
		_RouteDetail =(Button)findViewById(R.id.DSbuttonroutedetail);
		_Customercare = (Button)findViewById(R.id.DSbuttoncustomercare);
		
		// Useing on Click listener For doing Event on BUtton
		_stopDetail.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// Intent Function is used to go to next page
				Intent gostopdetail = new Intent(getApplicationContext(), DtcStopDetail.class);
				startActivity(gostopdetail);
				
			}
		});
		// Useing on Click listener For doing Event on BUtton
		_RouteDetail.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// Intent Function is used to go to next page
				Intent goRoute = new Intent(getApplicationContext(), BusRouteDetail.class);	
				startActivity(goRoute);
			}
		});
		// Useing on Click listener For doing Event on BUtton
		_Customercare.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// Intent Function is used to go to next page
				Intent gocare = new Intent(getApplicationContext(), CustomerCareDtc.class);
				startActivity(gocare);
				
			}
		});
		
	}
}
