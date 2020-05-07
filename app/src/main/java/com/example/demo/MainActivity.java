package com.example.demo;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private View iv;
    private int a;
    private String TAG = "==============MainActivity==============";
    private MyListAdapter myListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyButton btn = findViewById(R.id.debug);



//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            }
//        });


//        btn.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return false;
//            }
//        });
    }


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
