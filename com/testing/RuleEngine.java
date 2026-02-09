package com.testing;
public class RuleEngine {

    public double ruleScore(User user, Movie movie) {
        double score = 0;

        if (movie.rating >= 4)
            score += 0.3;

        if (movie.trending)
            score += 0.2;

        if (movie.genre.equals("Sci-Fi"))
            score += 0.2;

        return score;
    }
}
