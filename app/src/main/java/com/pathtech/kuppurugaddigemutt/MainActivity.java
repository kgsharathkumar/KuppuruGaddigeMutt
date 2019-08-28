package com.pathtech.kuppurugaddigemutt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    Toolbar toolbar;
    String[] app_namee;
    int[] app_name_resource = {R.drawable.icon_om_new,
            R.drawable.icon_om_new,
            R.drawable.icon_om_new,
            R.drawable.icon_om_new,
            R.drawable.icon_om_new,
            R.drawable.icon_om_new,
            R.drawable.icon_om_new,
            R.drawable.icon_om_new,
            R.drawable.icon_om_new};
    AppAdapter adapter;
    Context context;
    ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* button =(ImageButton) findViewById(R.id.btnSwitch);*/

        context = this;
        listView = (ListView) findViewById(R.id.list_view);
        app_namee = getResources().getStringArray(R.array.app_namee);
        int i = 0;
        adapter = new AppAdapter(getApplicationContext(), R.layout.list_view);
        listView.setAdapter(adapter);
        for (String namee : app_namee) {
            AppDataProvider dataProvider = new AppDataProvider(app_name_resource[i],namee);
            adapter.add(dataProvider);
            i++;
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context, app_namee[position], Toast.LENGTH_LONG).show();

               //onclick of About Kuppuru Gaddige Matt
                if (position == 0) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), AboutKuppuruActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                //onclick of mirror
                if (position == 1) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), AboutSwamijiActivity.class);
                    startActivityForResult(myIntent, 0);
                }


                //onclick of calculator
                if (position == 2) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), GallaryActivity.class);
                    startActivityForResult(myIntent, 0);
                }


                //onclick of contactbackup
                if (position == 3) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), PoojaInfoActivity.class);
                    startActivityForResult(myIntent, 0);
                }

                //onclick of contactbackup
                if (position == 4) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), PoojaInfoActivity.class);
                    startActivityForResult(myIntent,0);
                }

                if(position == 5) {
                    Intent myIntent = new Intent(view.getContext(),FeedbackActivity.class);
                    startActivityForResult(myIntent,0);
                }

                if(position == 6) {
                    Intent myIntent = new Intent(view.getContext(),FeedbackActivity.class);
                    startActivityForResult(myIntent,0);
                }

                //onclick of contactbackup
                if (position == 8) {
                    //code specific to first list item
                    Intent myIntent = new Intent(view.getContext(), FeedbackActivity.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });


    }

}

