package FreeDraw.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class DrawingPanel extends View { 
	
	public DrawingPanel(Context context, AttributeSet attrs){ 
		super(context, attrs);  }

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) { 
		// is called on creation with old values 0 and 0 
		super.onSizeChanged(w, h, oldw, oldh); 
 } 
	@Override 
	protected void onDraw(Canvas canvas) { 
		// is called automatically when “invalidate()” is used 
 
 } 
}