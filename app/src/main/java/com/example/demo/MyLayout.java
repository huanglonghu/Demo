package com.example.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class MyLayout extends LinearLayout {
    public MyLayout(Context context) {
        super(context);
    }

    public MyLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private String TAG = "==============MyLayout==============";

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
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        String tag = "onInterceptTouchEvent=========";

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println(TAG + tag + "down");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println(TAG + tag + "move");
                return false;
            case MotionEvent.ACTION_UP:
                System.out.println(TAG + tag + "up");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        String tag = "dispatchTouchEvent=========";

        switch (ev.getAction()) {
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



        return super.dispatchTouchEvent(ev);
    }
}
