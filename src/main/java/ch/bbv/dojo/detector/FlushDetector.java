package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.HandRank;
import ch.bbv.dojo.Suite;

import java.util.List;

/**
 * Created by gro on 08/04/16.
 */
public class FlushDetector implements Detector {

    private final List<Card> hand;

    public FlushDetector(List<Card> hand) {
        this.hand = hand;
    }

    @Override
    public boolean is() {
        Suite suiteOfFirstCard = hand.get(0).getSuite();
        return hand.stream().map(Card::getSuite).allMatch(suite -> suite == suiteOfFirstCard);
    }

    @Override
    public HandRank getHandRank() {
        return HandRank.Flush;
    }
}
