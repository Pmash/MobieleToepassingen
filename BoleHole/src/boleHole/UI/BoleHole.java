package boleHole.UI;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Chronometer;
import android.widget.TextView;

public class BoleHole extends Activity {
	
	
	Chronometer chrono;
	ImageButton btnStart;
	ImageButton btnStop;
	ImageButton btnReset;
	TextView txt;
	long elapsedTime=0;
	String currentTime="";
	long startTime=SystemClock.elapsedRealtime();
	Boolean resume=false;
	Paint paint;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(1);
        paint.setTextSize(20);
        setContentView(R.layout.activity_bole_hole);
        chrono =(Chronometer)findViewById(R.id.chrono);
		btnStart =(ImageButton)findViewById(R.id.btnStart);
		btnStop =(ImageButton)findViewById(R.id.btnStop);
		btnReset =(ImageButton)findViewById(R.id.btnReset);
		DrawingPanel z = new DrawingPanel(this);
		 z = (DrawingPanel) findViewById(R.id.drawing);
		
		
		
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
	 /*@Override
	    protected void onResume() {
	        super.onResume();
	        z.startSimulation();
	    }
	 
	    @Override
	    protected void onPause() {
	        super.onPause();
	        z.stopSimulation();
	    }   */
}

              
               


