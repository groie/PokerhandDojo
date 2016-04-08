package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;
import ch.bbv.dojo.CardValue;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gro on 08/04/16.
 */
public class StraightDetector implements Detector {

    @Override
    public boolean is(List<Card> hand) {

        Boolean[] matches = new Boolean[CardValue.values().length+1];
        Arrays.fill(matches, false);


        for (Card card : hand) {
            switch (card.getValue()) {
                case ACE:
                    matches[0] = true;
                default:
                    matches[card.getValue().getIntVal()-1] = true;
            }
        }

        int count = 0;

        for (Boolean match : matches) {
            if(match) {
                count++;
            }
            else {
                count = 0;
            }
            if (count == 5) return true;
        }
        return false;
    }
}
