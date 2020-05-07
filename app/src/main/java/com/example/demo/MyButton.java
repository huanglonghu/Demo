package com.example.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;

public class MyButton extends TextView{

    private boolean debug;

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private String TAG = "==============MyButton==============";

    @Override
    public boolean onTouchEvent(MotionEvent event) {


        String tag = "onTouchEvent=========";

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println(TAG + tag + "down");
               break;
            case MotionEvent.ACTION_MOVE:
                System.out.println(TAG + tag + "move");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println(TAG + tag + "up");
                break;
        }
        return super.onTouchEvent(event);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        String tag = "dispatchTouchEvent=========";

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println(TAG + tag + "down");
               return true;
            case MotionEvent.ACTION_MOVE:
                System.out.println(TAG + tag + "move");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println(TAG + tag + "up");
                break;
        }
        return super.dispatchTouchEvent(event);
    }
}
