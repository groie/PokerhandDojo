package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.CardValue;
import scala.Int;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gro on 07/04/16.
 */
public class PairDetector {

    public boolean is(List<Card> hand) {
        Map<CardValue, Integer> matches = new HashMap<>();
        for (Card card : hand) {
            Integer count = matches.getOrDefault(card.getValue(), 0);
            matches.put(card.getValue(), count+1);
        }
        return matches.values().stream().anyMatch(x -> x > 1);
    }
}
