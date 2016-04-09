package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.CardValue;

import java.util.List;

/**
 * Created by gro on 08/04/16.
 */
public class FourOfKindDetector implements Detector {

    private final List<Card> hand;

    public FourOfKindDetector(List<Card> hand) {
        this.hand = hand;
    }

    @Override
    public boolean is() {
        hand.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        CardValue pivotCardValue = hand.get(2).getValue();

        List<Card> first = hand.subList(0, 4);
        List<Card> second = hand.subList(1, 5);
        return  first.stream().allMatch(c -> c.getValue() == pivotCardValue) ||
                second.stream().allMatch(c -> c.getValue() == pivotCardValue);
    }
}
