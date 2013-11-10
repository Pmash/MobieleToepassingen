package boleHole.UI;
import java.util.Timer;
import java.util.TimerTask;

import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;


public class Chrono extends BoleHole{
	
	Chronometer chrono;
	long elapsedTime=0;
	String currentTime="";
	long startTime=SystemClock.elapsedRealtime();
	Boolean resume=false;
	
	public void tel( View v, ImageButton btnStart, TextView txt){
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
		  currentTime = (String) chrono.getText();
	   btnStart.setEnabled(true);	
	   btnStop.setEnabled(false);	
	   chrono.stop();	
	   chrono.setText(currentTime);	
	   resume=true;	
	   //btnStart.setText("Resume");	
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


