package com.example.ytlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ytlayout.adapter.FilmAdapter;
import com.example.ytlayout.adapter.MenuAdapter;
import com.example.ytlayout.adapter.PlaylistAdapter;
import com.example.ytlayout.model.Film;
import com.example.ytlayout.model.Menu;
import com.example.ytlayout.model.Playlist;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private RecyclerView rvFilm, rvMenu, rvPlay;
    private FilmAdapter adapter;
    private ArrayList<Film> films;
    private MenuAdapter menuAdapter;
    private ArrayList<Menu> menus;
    private PlaylistAdapter playlistAdapter;
    private ArrayList<Playlist> playlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFilm = findViewById(R.id.rv_film);

        films = new ArrayList<>();
        films.add(new Film("Iron Man", "2008", R.drawable.ironman));
        films.add(new Film("The Incredible Hulk", "2008", R.drawable.hulk));
        films.add(new Film("Iron Man 2", "2010", R.drawable.ironman2));
        films.add(new Film("Thor", "2011", R.drawable.thor));
        films.add(new Film("Captain America: The First Avenger", "2011", R.drawable.captainamerica));
        films.add(new Film("Marvel's The Avengers", "2012", R.drawable.theavenger));
        films.add(new Film("Iron Man 3", "2013", R.drawable.ironman3));
        films.add(new Film("Thor: The Dark World", "2013", R.drawable.thorthedarkworld));
        films.add(new Film("Captain America: The Winter Soldier", "2014", R.drawable.captainamerica2));
        films.add(new Film("Guardians of The Galaxy", "2014", R.drawable.gog));
        films.add(new Film("Avengers: Age of Ultron", "2015", R.drawable.avengerultron));
        films.add(new Film("Ant-Man", "2015", R.drawable.antman));
        films.add(new Film("Captain America: Civil War", "2016", R.drawable.captainamerica3));
        films.add(new Film("Doctor Strange", "2016", R.drawable.doctorstrange));
        films.add(new Film("Guardians of the Galaxy Vol. 2", "2017", R.drawable.gog2));
        films.add(new Film("Spider-Man: Homecoming", "2017", R.drawable.homecoming));
        films.add(new Film("Thor: Ragnarok", "2017", R.drawable.thorragnarok));
        films.add(new Film("Black Panther", "2018", R.drawable.blackpanther));
        films.add(new Film("Avengers: Infinity War", "2018", R.drawable.avengerinfinitywar));
        films.add(new Film("Ant-Man and the Wasp", "2018", R.drawable.antmanandthewasp));
        films.add(new Film("Captain Marvel", "2019", R.drawable.captainmarvel));
        films.add(new Film("Avengers: Endgame", "2019", R.drawable.avengerendgame));
        films.add(new Film("Spider-Man: Far Frome Home", "2019", R.drawable.farfromhome));

        adapter = new FilmAdapter(MainActivity.this, films);
        rvFilm.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvFilm.setHasFixedSize(true);
        rvFilm.setAdapter(adapter);

        rvMenu = findViewById(R.id.rv_menu);

        menus = new ArrayList<>();
        menus.add(new Menu(R.drawable.history, "History", ""));
        menus.add(new Menu(R.drawable.download, "Downloads", "1 video"));
        menus.add(new Menu(R.drawable.myvideos, "My Videos", ""));
        menus.add(new Menu(R.drawable.watchlater, "Watch Later", "5 unwatched videos"));

        menuAdapter = new MenuAdapter(MainActivity.this, menus);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        rvMenu.setHasFixedSize(true);
        rvMenu.setAdapter(menuAdapter);

        rvPlay = findViewById(R.id.rv_playlist);

        playlist = new ArrayList<>();
        playlist.add(new Playlist(R.drawable.like, "Liked Videos", "28 Videos"));
        playlist.add(new Playlist(R.drawable.lopniv, "My Playlist", "118 Videos"));
        playlist.add(new Playlist(R.drawable.game, "One", "90 Videos"));

        playlistAdapter = new PlaylistAdapter(MainActivity.this, playlist);
        rvPlay.setLayoutManager(new LinearLayoutManager(this));
        rvPlay.setHasFixedSize(true);
        rvPlay.setAdapter(playlistAdapter);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
