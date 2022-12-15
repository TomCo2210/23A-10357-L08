package dev.tomco.a23a_10357_l08.Model;

public class Movie {


    private String title = "";
    private String image = "";
    private int duration = 0; // in minutes
    private int year = 0;
    private long reviews = 0;
    private boolean isFavorite = false;
    private float rating = 0.0f;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Movie setImage(String image) {
        this.image = image;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Movie setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Movie setYear(int year) {
        this.year = year;
        return this;
    }

    public long getReviews() {
        return reviews;
    }

    public Movie setReviews(long reviews) {
        this.reviews = reviews;
        return this;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public Movie setFavorite(boolean favorite) {
        isFavorite = favorite;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Movie setRating(float rating) {
        this.rating = rating;
        return this;
    }
}
