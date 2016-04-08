package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.CardValue;
import ch.bbv.dojo.Hand;

import java.util.List;

/**
 * Created by gro on 08/04/16.
 */
public class FourOfKindDetector implements Detector {

    @Override
    public boolean is(List<Card> hand) {
        List<Card> sortedHand = Hand.sort(hand);

        CardValue pivotCardValue = sortedHand.get(2).getValue();

        List<Card> first = sortedHand.subList(0, 4);
        List<Card> second = sortedHand.subList(1, 5);
        return  first.stream().allMatch(c -> c.getValue() == pivotCardValue) ||
                second.stream().allMatch(c -> c.getValue() == pivotCardValue);
    }
}
