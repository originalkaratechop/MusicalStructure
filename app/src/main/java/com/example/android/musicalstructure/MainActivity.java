package com.example.android.musicalstructure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        final ArrayList<TrackInfo> tracks = new ArrayList<TrackInfo>();
        int arraySize = 0;
        for (int i = 0; i < i + 1; i++) {
            int art = getResources().getIdentifier("artist" + i, "string", getPackageName());
            if (art != 0) {
                int ttl = getResources().getIdentifier("trackTitle" + i, "string", getPackageName());
                int alb = getResources().getIdentifier("album" + i, "string", getPackageName());
                int len = getResources().getIdentifier("length" + i, "string", getPackageName());
                int img = getResources().getIdentifier("img_album" + i, "drawable", getPackageName());
                arraySize = arraySize + 1;
                tracks.add(new TrackInfo(art, ttl, alb, len, img));
            } else {
                break;
            }
        }

        TrackAdapter adapter = new TrackAdapter(this, tracks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TrackInfo dataModel = tracks.get(position);

                Integer trackArtist = dataModel.getTrackArtist();
                Integer trackTitle = dataModel.getTrackTitle();
                Integer trackAlbum = dataModel.getTrackAlbum();
                Integer trackLength = dataModel.getTrackLength();
                Integer trackImgAlbum = dataModel.getTrackLength();

                Intent currentIntent = new Intent(MainActivity.this, CurrentTrackActivity.class);
                currentIntent.putExtra("artist", trackArtist);
                currentIntent.putExtra("title", trackTitle);
                currentIntent.putExtra("album", trackAlbum);
                currentIntent.putExtra("length", trackLength);
                currentIntent.putExtra("imgAlbum", trackImgAlbum);
                startActivity(currentIntent);
            }
        });


    }
}
