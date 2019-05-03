package com.example.ytlayout.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ytlayout.R;
import com.example.ytlayout.model.Film;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmViewHolder> {
    private Context context;

    private ArrayList<Film> films;

    public FilmAdapter(Context context, ArrayList<Film> films) {
        this.context = context;
        this.films = films;
    }

    @NonNull
    @Override
    public FilmAdapter.FilmViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false);
        return new FilmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmAdapter.FilmViewHolder filmViewHolder, int i) {
        filmViewHolder.bind(films.get(i));
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public class FilmViewHolder extends RecyclerView.ViewHolder {

        ImageView imgView;
        TextView tvJudul, tvChannel;
        LinearLayout itemFilm;

        public FilmViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.iv_album);
            tvChannel = itemView.findViewById(R.id.tv_channel);
            tvJudul= itemView.findViewById(R.id.tv_judul);
            itemFilm = itemView.findViewById(R.id.item_film);
        }

        public void bind(final Film data) {
            tvChannel.setText(data.getChannel());
            tvJudul.setText(data.getJudul());
            imgView.setImageResource(data.getAlbum());
        }
    }
}
