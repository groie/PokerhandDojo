package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.HandRank;

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
        ThreeOfKindDetector threeOfKind = new ThreeOfKindDetector(hand);
        PairDetector pair = new PairDetector(hand);
        return threeOfKind.is() && pair.is() && threeOfKind.tiebreakCard() != pair.tiebreakCard();
    }

    @Override
    public HandRank getHandRank() {
        return HandRank.FullHouse;
    }
}
