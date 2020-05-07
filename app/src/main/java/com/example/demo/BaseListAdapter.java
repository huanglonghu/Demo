package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class BaseListAdapter<T> extends BaseAdapter {

    public List<T> datas;
    public Context context;
    public HashMap<Integer, View> viewMap = new HashMap<>();
    private LayoutInflater layoutInflater;
    private int res;;

    public BaseListAdapter(Context context, List<T> datas, int res) {
        this.datas = datas;
        this.context = context;
        this.res = res;
        layoutInflater = LayoutInflater.from(context);
    }

    public HashMap<Integer, View> getViewMap() {
        return viewMap;
    }

    public void setViewMap(HashMap<Integer, View> viewMap) {
        this.viewMap = viewMap;
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (viewMap.get(position) == null) {
            convertView = initView(layoutInflater, res, datas, position, parent);
            viewMap.put(position, convertView);
        }
        return viewMap.get(position);
    }

    protected abstract View initView(LayoutInflater layoutInflater, int res, List<T> datas, int position, ViewGroup parent);




}
