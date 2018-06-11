package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CurrentTrackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_activity);

        Intent main = getIntent();

        Integer trackArtist = main.getIntExtra("artist", 0);
        Integer trackTitle = main.getIntExtra("title", 0);
        Integer trackAlbum = main.getIntExtra("album", 0);
        Integer trackLength = main.getIntExtra("length", 0);
        Integer trackImgAlbum = main.getIntExtra("imgAlbum", 0);

        TextView artist = findViewById(R.id.artist_text_view);
        TextView title = findViewById(R.id.title_text_view);
        TextView album = findViewById(R.id.album_text_view);
        TextView length = findViewById(R.id.track_len_text_view);
        ImageView imgAlbum = findViewById(R.id.album_image_view);

        artist.setText(trackArtist);
        title.setText(trackTitle);
        album.setText(trackAlbum);
        length.setText(trackLength);
      //  imgAlbum.setImageResource(trackImgAlbum);
    }
}
