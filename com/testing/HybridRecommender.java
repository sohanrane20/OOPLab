package com.testing;
import java.util.*;

public class HybridRecommender {

    RuleEngine ruleEngine = new RuleEngine();
    CollaborativeFilteringEngine cf = new CollaborativeFilteringEngine();

    public void recommend(User user, List<User> users, List<Movie> movies) {

        System.out.println("\nRecommendations for " + user.name + ":\n");

        for (Movie m : movies) {

            if (user.ratings.containsKey(m.id))
                continue;

            double contentScore =
                    SimilarityCalculator.cosine(
                            user.preferenceVector,
                            m.featureVector);

            double collabScore = 0;
            for (User u : users)
                if (u.id != user.id)
                    collabScore += cf.score(user, u, m);

            double ruleScore = ruleEngine.ruleScore(user, m);

            int ratingCount = user.ratings.size();
            double alpha = Math.min(ratingCount / 5.0, 1.0);

            double finalScore =
                    (1 - alpha) * contentScore +
                    alpha * collabScore +
                    ruleScore;

            System.out.printf("%s → %.3f%n", m.title, finalScore);
        }
    }
}
