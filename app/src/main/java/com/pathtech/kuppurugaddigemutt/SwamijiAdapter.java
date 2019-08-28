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
 * Created by BHAVYASHREE on 3/12/2017.
 */

public class SwamijiAdapter  extends ArrayAdapter {
    List list = new ArrayList();

    public SwamijiAdapter(Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler
    {
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
        SwamijiAdapter.DataHandler handler;
        if(convertView == null)
        {
            LayoutInflater inflater =(LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.swamijilist_view,parent,false);
            handler = new SwamijiAdapter.DataHandler();
            handler.name =(TextView)row.findViewById(R.id.title);
            row.setTag(handler);
        }
        else
        {
            handler = (SwamijiAdapter.DataHandler)row.getTag();

        }
        SwamijiDataProvider dataProvider;
        dataProvider = (SwamijiDataProvider)this.getItem(position);
        handler.name.setText(dataProvider.getApp_namee());
        return row;
    }
}
