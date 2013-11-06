package FreeDraw.ui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Draw extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_draw);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.draw, menu);
		return true;
	}

	public void onClick(View view){ 
		switch(view.getId())
		{
		case R.id.imageButtonBlack:
			((ImageButton)view).setImageDrawable(getResources().getDrawable(R.id.imageButtonBlack)); 
			 //more things to do when the colour button was clicked 
		break;
		case R.id.imageButtonBlue:
			((ImageButton)view).setImageDrawable(getResources().getDrawable(R.id.imageButtonBlue)); 
			 //more things to do when the colour button was clicked 
			break;
		case R.id.imageButtonGreen:
			((ImageButton)view).setImageDrawable(getResources().getDrawable(R.id.imageButtonGreen)); 
			 //more things to do when the colour button was clicked 
			break;
		case R.id.imageButtonYellow:
			((ImageButton)view).setImageDrawable(getResources().getDrawable(R.id.imageButtonYellow)); 
			 //more things to do when the colour button was clicked 
			break;
		case R.id.imageButtonRed:
			((ImageButton)view).setImageDrawable(getResources().getDrawable(R.id.imageButtonRed)); 
			 //more things to do when the colour button was clicked 
			break;
		case R.id.imageButtonBrown:
			((ImageButton)view).setImageDrawable(getResources().getDrawable(R.id.imageButtonBrown)); 
			 //more things to do when the colour button was clicked 
			break;
		default:
		throw new RuntimeException("Unknow button ID");
		//bron: http://stackoverflow.com/questions/3412180/how-to-determine-which-button-pressed-on-android
		 
		
	}

}
	
	
	
}
