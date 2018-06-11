package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<TrackInfo> {
    public TrackAdapter(Activity context, ArrayList<TrackInfo> tracks) {
        super(context, 0, tracks);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_track, parent, false);
        }
        TrackInfo currentTrack = getItem(position);

        TextView artist = (TextView) listItemView.findViewById(R.id.artist_text_view);
        TextView title = (TextView) listItemView.findViewById(R.id.title_text_view);
        TextView album = (TextView) listItemView.findViewById(R.id.album_text_view);
        TextView length = (TextView) listItemView.findViewById(R.id.track_length_text_view);
        ImageView imgAlbum = (ImageView) listItemView.findViewById(R.id.album_image_view);

        artist.setText(currentTrack.getTrackArtist());
        title.setText(currentTrack.getTrackTitle());
        album.setText(currentTrack.getTrackAlbum());
        length.setText(currentTrack.getTrackLength());
        imgAlbum.setImageResource(currentTrack.getTrackImgAlbum());

        return listItemView;
    }
}
