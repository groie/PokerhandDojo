package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.CardValue;
import ch.bbv.dojo.HandRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gro on 07/04/16.
 */
public class PairDetector implements Detector {

    private final List<Card> hand;

    public PairDetector(List<Card> hand) {
        this.hand = hand;
    }

    public boolean is() {
        Map<CardValue, Integer> matches = getCardValueIntegerMap();
        return matches.values().stream().anyMatch(x -> x == 2);
    }

    @Override
    public HandRank getHandRank() {
        return HandRank.Pair;
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
        CardValue cv = matches.entrySet().stream().filter(x -> x.getValue() == 2).map(Map.Entry::getKey).findFirst().orElseThrow(RuntimeException::new);
        return hand.stream().filter(c -> c.getValue() == cv).findFirst().orElseThrow(RuntimeException::new);
    }
}
