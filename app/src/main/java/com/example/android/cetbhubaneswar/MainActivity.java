package com.example.android.cetbhubaneswar;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> str;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str = new ArrayList<>();
        str.add("Home");
        str.add("About CET");
        str.add("Facilities");
        str.add("Departments");
        str.add("Careers");
        str.add("Placements");
        str.add("Notice Board");
        str.add("Contact Us");

        arrayAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);
        listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        Intent homeIntent = new Intent(MainActivity.this, Home.class);
                        startActivity(homeIntent);
                        break;
                    case 1:
                        Intent aboutCET = new Intent(MainActivity.this, AboutCET.class);
                        startActivity(aboutCET);
                        break;
                    case 2:
                        Intent facilities = new Intent(MainActivity.this, Facilities.class);
                        startActivity(facilities);
                        break;
                    case 3:
                        Intent dept = new Intent(MainActivity.this, Departments.class);
                        startActivity(dept);
                        break;
                    case 4:
                        Intent careers = new Intent(MainActivity.this, Careers.class);
                        startActivity(careers);
                        break;
                    case 5:
                        Intent placements = new Intent(MainActivity.this, Placements.class);
                        startActivity(placements);
                        break;
                    case 6:
                        Intent notice = new Intent(MainActivity.this, NoticeBoard.class);
                        startActivity(notice);
                        break;
                    case 7:
                        Intent contact = new Intent(MainActivity.this, ContactUs.class);
                        startActivity(contact);
                        break;
                }
            }
        });
      }
}
