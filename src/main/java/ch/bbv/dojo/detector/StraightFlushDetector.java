package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.HandRank;

import java.util.List;

/**
 * Created by gro on 08/04/16.
 */
public class StraightFlushDetector implements Detector{

    private List<Card> hand;

    public StraightFlushDetector(List<Card> hand) {
        this.hand = hand;
    }

    @Override
    public boolean is() {
        return new StraightDetector(hand).is() && new FlushDetector(hand).is();
    }

    @Override
    public HandRank getHandRank() {
        return HandRank.StraightFlush;
    }
}
