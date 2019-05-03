package com.example.ytlayout.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ytlayout.R;
import com.example.ytlayout.model.Playlist;

import java.util.ArrayList;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder> {

    private Context context;
    private ArrayList<Playlist> playlist;

    public PlaylistAdapter(Context context, ArrayList<Playlist> playlist) {
        this.context = context;
        this.playlist = playlist;
    }

    @NonNull
    @Override
    public PlaylistAdapter.PlaylistViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.playlist_item, viewGroup, false);
        return new PlaylistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaylistAdapter.PlaylistViewHolder playlistViewHolder, int i) {
        playlistViewHolder.bind(playlist.get(i));
    }

    @Override
    public int getItemCount() {
        return playlist.size();
    }

    public class PlaylistViewHolder extends RecyclerView.ViewHolder {

        ImageView imgView;
        TextView judul, desc;

        public PlaylistViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.iv_iconPlay);
            judul = itemView.findViewById(R.id.tv_judulPlay);
            desc = itemView.findViewById(R.id.tv_descPlay);
        }

        public void bind(Playlist playlist) {
            judul.setText(playlist.getJudul());
            desc.setText(playlist.getJmlVideo());
            imgView.setImageResource(playlist.getImage());
        }
    }
}
