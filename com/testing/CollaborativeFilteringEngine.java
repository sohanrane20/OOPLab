package com.testing;
// import java.util.*;

public class CollaborativeFilteringEngine {

    public double score(User target, User other, Movie movie) {
        if (!other.ratings.containsKey(movie.id)) return 0;

        double sim = SimilarityCalculator.cosine(
                target.preferenceVector,
                other.preferenceVector);

        return sim * other.ratings.get(movie.id);
    }
}
