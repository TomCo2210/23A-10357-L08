package dev.tomco.a23a_10357_l08.Interfaces;

import dev.tomco.a23a_10357_l08.Model.Movie;

public interface MovieCallback {
    void favoriteClicked(Movie movie, int position);
    void itemClicked(Movie movie, int position);
}
