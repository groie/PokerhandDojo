package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.CardValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gro on 08/04/16.
 */
public class ThreeOfKindDetector implements Detector {

    private final List<Card> hand;

    public ThreeOfKindDetector(List<Card> hand) {
        this.hand = hand;
    }

    public boolean is() {
        Map<CardValue, Integer> matches = new HashMap<>();
        for (Card card : hand) {
            Integer count = matches.getOrDefault(card.getValue(), 0);
            matches.put(card.getValue(), count+1);
        }
        return matches.values().stream().anyMatch(x -> x == 3);
    }
}
