package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;

import java.util.List;

/**
 * Created by gro on 08/04/16.
 */
public class FlushDetector implements Detector {
    @Override
    public boolean is(List<Card> hand) {
        return hand.stream().allMatch(c -> c.getSuite() == hand.get(0).getSuite());
    }
}
