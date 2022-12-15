package dev.tomco.a23a_10357_l08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import dev.tomco.a23a_10357_l08.Adapters.MovieAdapter;
import dev.tomco.a23a_10357_l08.Interfaces.MovieCallback;
import dev.tomco.a23a_10357_l08.Model.Movie;
import dev.tomco.a23a_10357_l08.Utils.DataManager;

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_LST_movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        initViews();
    }


    private void findViews() {
        main_LST_movies = findViewById(R.id.main_LST_movies);
    }

    private void initViews() {
        MovieAdapter movieAdapter = new MovieAdapter(this, DataManager.getMovies());
        main_LST_movies.setLayoutManager(new LinearLayoutManager(this));
//        main_LST_movies.setLayoutManager(new GridLayoutManager(this,2));
        main_LST_movies.setAdapter(movieAdapter);
        movieAdapter.setMovieCallback(new MovieCallback() {
            @Override
            public void favoriteClicked(Movie movie, int position) {
                movie.setFavorite(!movie.isFavorite());
                main_LST_movies.getAdapter().notifyItemChanged(position);
            }

            @Override
            public void itemClicked(Movie movie, int position) {
                Toast.makeText(MainActivity.this,""+ movie.getTitle() + " has been clicked!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}