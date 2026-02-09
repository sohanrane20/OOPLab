package com.testing;
import java.util.*;

public class User {
    int id;
    String name;
    double[] preferenceVector = new double[]{0,0,0,1};
    Map<Integer, Double> ratings = new HashMap<>();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void rateMovie(Movie movie, double rating) {
        ratings.put(movie.id, rating);
        learn(movie, rating);
    }

    private void learn(Movie movie, double rating) {
        for (int i = 0; i < preferenceVector.length; i++) {
            preferenceVector[i] += movie.featureVector[i] * (rating / 5.0);
        }
    }
}
