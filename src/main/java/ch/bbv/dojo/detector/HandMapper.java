package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.HandRank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gro on 14/04/16.
 */
public class HandMapper {

    private final List<Detector> detectors = new ArrayList<>();


    public HandMapper(List<Card> hand) {
        detectors.add(new StraightFlushDetector(hand));
        detectors.add(new FourOfKindDetector(hand));
        detectors.add(new FullHouseDetector(hand));
        detectors.add(new StraightDetector(hand));
        detectors.add(new FlushDetector(hand));
        detectors.add(new TwoPairDetector(hand));
        detectors.add(new ThreeOfKindDetector(hand));
        detectors.add(new PairDetector(hand));
    }


    public HandRank getRank() {
        return detectors.stream().filter(Detector::is)
                .map(Detector::getHandRank).findFirst().orElse(HandRank.HighCard);
    }
}
