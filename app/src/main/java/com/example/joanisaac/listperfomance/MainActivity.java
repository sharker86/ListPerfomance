package com.example.joanisaac.listperfomance;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private static final int MAX_VALUES = 100000;
    private ArrayList<Model> modelValues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listview = (ListView) findViewById(R.id.lista);


        modelValues = new ArrayList<Model>();
        for(int i= 0; i < MAX_VALUES; i++){
            //Bitmap bMap = BitmapFactory.decodeFile("/sdcard/test2.png");

            int bMap = R.drawable.tendencias;
            Model val = new Model(bMap,"Title "+Integer.toString(i),"Descripcion "+Integer.toString(i));

            modelValues.add(val);
        }

        final ArrayList<String> list = new ArrayList<String>();

        //final ArrayAdapter<Model> adapter = new ArrayAdapter<Model>(this,
        //        android.R.layout.two_line_list_item, android.R.id.text1, modelValues);
        CustomAdapter adapter = new CustomAdapter(this, modelValues);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {

                ShowDetail(position);
            }

        });
    }

    public void ShowDetail(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("SampleModel", modelValues.get(position));
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
