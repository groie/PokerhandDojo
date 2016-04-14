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
        Map<CardValue, Integer> matches = getCardValueIntegerMap();

        return matches.values().stream().anyMatch(x -> x == 3);
    }

    private Map<CardValue, Integer> getCardValueIntegerMap() {
        Map<CardValue, Integer> matches = new HashMap<>();
        for (Card card : hand) {
            Integer count = matches.getOrDefault(card.getValue(), 0);
            matches.put(card.getValue(), count+1);
        }
        return matches;
    }


    public Card tiebreakCard() {
        Map<CardValue, Integer> matches = getCardValueIntegerMap();
        CardValue cv = matches.entrySet().stream().filter(x -> x.getValue() == 3).map(Map.Entry::getKey).findFirst().orElseThrow(RuntimeException::new);
        return hand.stream().filter(c -> c.getValue() == cv).findFirst().orElseThrow(RuntimeException::new);
    }
}
