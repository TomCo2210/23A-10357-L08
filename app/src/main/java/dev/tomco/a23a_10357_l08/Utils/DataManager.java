package dev.tomco.a23a_10357_l08.Utils;

import java.util.ArrayList;

import dev.tomco.a23a_10357_l08.Model.Movie;

public class DataManager {

    public static ArrayList<Movie> getMovies(){
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie()
                .setTitle("Red Notice")
                .setYear(2021)
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wdE6ewaKZHr62bLqCn7A2DiGShm.jpg")
                .setDuration(116)
                .setRating(36)
                .setReviews(174)
                .setFavorite(true)
        );

        movies.add(new Movie()
                .setTitle("The Shawshank Redemption")
                .setYear(1994)
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/vdVab7yNvgYEMd8shCfy2D6nTMu.jpg")
                .setDuration(142)
                .setRating(91)
                .setReviews(82)
        );


        movies.add(new Movie()
                .setTitle("Venom: Let There Be Carnage")
                .setYear(2021)
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1MJNcPZy46hIy2CmSqOeru0yr5C.jpg")
                .setDuration(97)
                .setRating(57)
                .setReviews(275)
        );

        movies.add(new Movie()
                .setTitle("The Lord of the Rings: The Return of the King")
                .setYear(2003)
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rCzpDGLbOoPwLjy3OAm5NUPOTrC.jpg")
                .setDuration(201)
                .setRating(93)
                .setReviews(274)
        );

        movies.add(new Movie()
                .setTitle("A clockwork orange")
                .setYear(1971)
                .setImage("https://images-na.ssl-images-amazon.com/images/S/pv-target-images/18008ecca4b19aa99c2e23d10ae26b9aaf838c98c0bb6acd4164006eb4ad07f8._RI_V_TTW_.jpg")
                .setDuration(136)
                .setRating(88)
                .setReviews(80)
        );

        movies.add(new Movie()
                .setTitle("The Mummy")
                .setYear(1999)
                .setImage("https://www.themoviedb.org/t/p/w1280/yhIsVvcUm7QxzLfT6HW2wLf5ajY.jpg")
                .setDuration(124)
                .setRating(61)
                .setReviews(101)
        );

        movies.add(new Movie()
                .setTitle("Shang-Chi and the Legend of the Ten Rings")
                .setYear(2021)
                .setImage("https://www.themoviedb.org/t/p/w600_and_h900_bestv2/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg")
                .setDuration(132)
                .setRating(91)
                .setReviews(337)
        );

        movies.add(new Movie()
                .setTitle("The Hitchhiker's Guide to the Galaxy")
                .setYear(2005)
                .setImage("https://www.themoviedb.org/t/p/w1280/jWOmLRfYWrgzQFZL1pHep9QYT1Z.jpg")
                .setDuration(109)
                .setRating(60)
                .setReviews(199)
        );


        return movies;
    }
}
