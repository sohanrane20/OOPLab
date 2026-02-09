package com.testing;
import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Movie m1 = new Movie(1,"Inception","Sci-Fi",4.8,true);
        Movie m2 = new Movie(2,"Avengers","Action",4.5,true);
        Movie m3 = new Movie(3,"Titanic","Romance",4.2,false);
        Movie m4 = new Movie(4,"Interstellar","Sci-Fi",4.7,false);

        List<Movie> movies = List.of(m1,m2,m3,m4);

        User u1 = new User(1,"Sohan");
        User u2 = new User(2,"Amit");
        User u3 = new User(3,"Neha");

        u1.rateMovie(m1,5);
        u1.rateMovie(m2,4);

        u2.rateMovie(m1,4);
        u2.rateMovie(m4,5);

        u3.rateMovie(m2,5);
        u3.rateMovie(m3,4);

        List<User> users = List.of(u1,u2,u3);

        HybridRecommender recommender = new HybridRecommender();
        recommender.recommend(u1, users, movies);
    }
}
