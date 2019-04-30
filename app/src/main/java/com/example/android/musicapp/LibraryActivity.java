package com.example.android.musicapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);


        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new com.example.android.musicapp.Song("Monophobia", "Deadmau5", R.drawable.deadmau5));
        songs.add(new com.example.android.musicapp.Song("Lone Digger", "Caravan Palace", R.drawable.caravan));
        songs.add(new com.example.android.musicapp.Song(" Feels like Summer", "Childish Gambino", R.drawable.gambino));
        songs.add(new com.example.android.musicapp.Song("Youngblood", "5 Seconds of Summer", R.drawable.summers));
        songs.add(new com.example.android.musicapp.Song("Crystalline", "The Midnight", R.drawable.midnight));
        songs.add(new com.example.android.musicapp.Song("Shelter", "Porter Robinson & Madeon", R.drawable.madeon));

        SongAdapter myAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(myAdapter);

    }
}
