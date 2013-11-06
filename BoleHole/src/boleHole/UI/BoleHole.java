package boleHole.UI;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class BoleHole extends Activity {
	
	Chronometer chrono;
	Button btnStart;
	Button btnStop;
	Button btnReset;
	TextView txt;
	long elapsedTime=0;
	String currentTime="";
	long startTime=SystemClock.elapsedRealtime();
	Boolean resume=false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bole_hole);
		chrono =(Chronometer)findViewById(R.id.chrono);
		btnStart =(Button)findViewById(R.id.btnStart);
		btnStop =(Button)findViewById(R.id.btnStop);
		btnReset =(Button)findViewById(R.id.btnReset);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bole_hole, menu);
		return true;
	}
	
	public void onClick(View v){
	switch(v.getId()){
		  case R.id.btnStart:
		  btnStart.setEnabled(false);
		  btnStop.setEnabled(true);
	
	if(!resume){	
	    chrono.setBase(SystemClock.elapsedRealtime());
	    chrono.start();
	   }
   else{
	    chrono.start();
	   }	
	break;	
	  case R.id.btnStop:	
	   btnStart.setEnabled(true);	
	   btnStop.setEnabled(false);	
	   chrono.stop();	
	   chrono.setText(currentTime);	
	   resume=true;	
	   btnStart.setText("Resume");	
	   break;	
	  case R.id.btnReset:
	 chrono.stop();	
	  chrono.setText("00:00");
	  resume=false;	
	  btnStop.setEnabled(false);
	   break;
	 }
	
	 }
}


