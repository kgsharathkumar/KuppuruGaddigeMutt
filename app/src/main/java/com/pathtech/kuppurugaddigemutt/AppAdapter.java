package com.pathtech.kuppurugaddigemutt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BHAVYASHREE on 12/16/2016.
 */

public class AppAdapter extends ArrayAdapter {
    List list = new ArrayList();

    public AppAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler
    {
        ImageView poster;
        TextView name;
    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }
    @Override
    public int getCount() {
        return this.list.size();
    }
    @Override
    public Object getItem(int position){
        return this.list.get(position);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View row;
        row = convertView;
        DataHandler handler;
        if(convertView == null)
        {
            LayoutInflater inflater =(LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_view,parent,false);
            handler = new DataHandler();
            handler.poster =(ImageView)row.findViewById(R.id.app_icon);
            handler.name =(TextView)row.findViewById(R.id.app_title);
            row.setTag(handler);
        }
        else
        {
            handler = (DataHandler)row.getTag();

        }
        AppDataProvider dataProvider;
        dataProvider = (AppDataProvider)this.getItem(position);
        handler.poster.setImageResource(dataProvider.getApp_name_resource());
        handler.name.setText(dataProvider.getApp_namee());
        return row;
    }
}
