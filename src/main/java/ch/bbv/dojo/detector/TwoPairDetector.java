package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.CardValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by gro on 07/04/16.
 */
public class TwoPairDetector implements Detector {

    public boolean is(List<Card> hand) {
        Map<CardValue, Integer> matches = new HashMap<>();
        List<CardValue> cardValues = hand.stream().map(Card::getValue).collect(Collectors.toList());
        for (CardValue cv : cardValues) {
            Integer count = matches.getOrDefault(cv, 0);
            matches.put(cv, count+1);
        }
        return matches.values().stream().filter(x -> x > 1).count() == 2;
    }
}
