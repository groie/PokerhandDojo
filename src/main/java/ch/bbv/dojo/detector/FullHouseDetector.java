package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;

import java.util.List;

/**
 * Created by gro on 08/04/16.
 */
public class FullHouseDetector implements Detector {

    private final List<Card> hand;

    public FullHouseDetector(List<Card> hand) {
        this.hand = hand;
    }

    @Override
    public boolean is() {
        return new ThreeOfKindDetector(hand).is() && new PairDetector(hand).is();
    }
}
