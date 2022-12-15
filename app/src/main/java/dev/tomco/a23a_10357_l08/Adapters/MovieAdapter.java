package dev.tomco.a23a_10357_l08.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

import dev.tomco.a23a_10357_l08.Interfaces.FavoriteCallback;
import dev.tomco.a23a_10357_l08.Model.Movie;
import dev.tomco.a23a_10357_l08.R;
import dev.tomco.a23a_10357_l08.Utils.ImageLoader;
import dev.tomco.a23a_10357_l08.Utils.TimeFormatter;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private Context context;
    private ArrayList<Movie> movies;
    private FavoriteCallback favoriteCallback;

    public MovieAdapter(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    public MovieAdapter setFavoriteCallback(FavoriteCallback favoriteCallback) {
        this.favoriteCallback = favoriteCallback;
        return this;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        MovieViewHolder movieViewHolder = new MovieViewHolder(view);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        Log.d("onBindViewHolder Position: ", "" + position);
        Movie movie = getItem(position);

        holder.movie_LBL_title.setText(movie.getTitle());
        holder.movie_LBL_year.setText(movie.getYear() + "");
        holder.movie_LBL_reviews.setText(movie.getReviews() + " reviews");
        holder.movie_LBL_duration.setText(TimeFormatter.getTimeFormatted(movie.getDuration()));
        if (movie.isFavorite())
            holder.movie_IMG_favorite.setImageResource(R.drawable.heart);
        else
            holder.movie_IMG_favorite.setImageResource(R.drawable.empty_heart);

        holder.movie_RTNG_rating.setRating(movie.getRating() / 20);
        ImageLoader.getInstance().load(movie.getImage(),holder.movie_IMG_poster);
    }

    @Override
    public int getItemCount() {
        return movies == null ? 0 : movies.size();
    }

    private Movie getItem(int position) {
        return movies.get(position);
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        private AppCompatRatingBar movie_RTNG_rating;
        private MaterialTextView movie_LBL_reviews;
        private MaterialTextView movie_LBL_duration;
        private MaterialTextView movie_LBL_year;
        private MaterialTextView movie_LBL_title;
        private AppCompatImageView movie_IMG_favorite;
        private AppCompatImageView movie_IMG_poster;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movie_RTNG_rating = itemView.findViewById(R.id.movie_RTNG_rating);
            movie_LBL_reviews = itemView.findViewById(R.id.movie_LBL_reviews);
            movie_LBL_duration = itemView.findViewById(R.id.movie_LBL_duration);
            movie_LBL_year = itemView.findViewById(R.id.movie_LBL_year);
            movie_LBL_title = itemView.findViewById(R.id.movie_LBL_title);
            movie_IMG_favorite = itemView.findViewById(R.id.movie_IMG_favorite);
            movie_IMG_poster = itemView.findViewById(R.id.movie_IMG_poster);

            movie_IMG_favorite.setOnClickListener(v -> {
                favoriteCallback.favoriteClicked(getItem(getAdapterPosition()), getAdapterPosition());
            });
        }
    }


}
