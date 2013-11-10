package boleHole.UI;

import java.util.Random;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class DrawingPanel extends View { 
	Paint paint;
	Paint hole;
	 Random rand = new Random();
	 int hx = rand.nextInt(800);
	 int hy = rand.nextInt(800);
	 
		
		public DrawingPanel(Context context, AttributeSet attrs){ 
			super(context, attrs);
			createCircle(paint);
			createCircle(hole);
			
			
			}
		public DrawingPanel(Context context){
			super(context);
			createCircle(paint);
			createCircleBlack(hole);
			
			
		}

		 @Override
		    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		        
		    }
		 
			
		public void createCircle(Paint paint){
			paint = new Paint();
			paint.setAntiAlias(true);
					paint.setStyle(Paint.Style.FILL_AND_STROKE);
					paint.setStrokeJoin(Paint.Join.ROUND);
					paint.setStrokeCap(Paint.Cap.ROUND);
			paint.setColor(Color.WHITE);
		}
		public void createCircleBlack(Paint hole){
			paint = new Paint();
			paint.setAntiAlias(true);
					paint.setStyle(Paint.Style.FILL_AND_STROKE);
					paint.setStrokeJoin(Paint.Join.ROUND);
					paint.setStrokeCap(Paint.Cap.ROUND);
			paint.setColor(Color.BLACK);
		}
	
						
		@Override 
		protected void onDraw(Canvas canvas) { 
		canvas.drawCircle(65, 80, 30, paint);
	    canvas.drawCircle(hx, hy, 40, hole);
	   
	 } 
	
		     
			
		}
		
		
		
		
	