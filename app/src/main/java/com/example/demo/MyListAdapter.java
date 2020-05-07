package com.example.demo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyListAdapter extends BaseListAdapter {

    private boolean debug;


    public MyListAdapter(Context context, List datas, int res) {
        super(context, datas, res);
    }

    @Override
    protected View initView(LayoutInflater layoutInflater, int res, List datas, final int position, ViewGroup parent) {


        MyButton textView = new MyButton(context);
        textView.setText("=======position=====" + position);
        textView.setTextSize(30);
        textView.setHeight(200);
        textView.setWidth(500);
        textView.setBackgroundColor(Color.BLUE);




//        textView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Toast.makeText(context,"======onTOuch========="+position,Toast.LENGTH_SHORT).show();
//                return false;
//            }
//        });

        return textView;
    }

    @Override
    public int getCount() {
        return 10;
    }


}
