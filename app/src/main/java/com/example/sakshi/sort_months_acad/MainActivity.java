package com.example.sakshi.sort_months_acad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class MainActivity extends AppCompatActivity {
    ListView listView;          //declaring listview
    String[] array;        //declaring Array
    Button asc;         //declaring buttons for ascending and descending order
    Button desc;
    ArrayAdapter arrayAdapter;      //declaring arrayAdapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list_view);        //associating list view
        asc=(Button)findViewById(R.id.ascending);           //associating buttons for ascending and descending
        desc=(Button)findViewById(R.id.descending);

        //Creating array for all the months in a year
        array= new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};

        //associating arrayAdapter
        arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,array);
        listView.setAdapter(arrayAdapter);      //setting adapter to listview

        asc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //on click listener for ascending button

                Arrays.sort(array);         //sorting of months in ascending order
                listView.setAdapter(arrayAdapter);      //setting it to adapter
            }
        });
        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arrays.sort(array,Collections.reverseOrder());      //sorting of months in descending order
                listView.setAdapter(arrayAdapter);          //setting it to adapter

            }
        });
    }
}
