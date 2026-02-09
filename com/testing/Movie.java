package com.testing;
public class Movie {
    int id;
    String title;
    String genre;
    double rating;
    boolean trending;
    double[] featureVector;

    public Movie(int id, String title, String genre, double rating, boolean trending) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.trending = trending;
        this.featureVector = buildVector();
    }

    private double[] buildVector() {
        return new double[]{
                genre.equals("Action") ? 1 : 0,
                genre.equals("Sci-Fi") ? 1 : 0,
                genre.equals("Romance") ? 1 : 0,
                rating / 5.0
        };
    }
}
