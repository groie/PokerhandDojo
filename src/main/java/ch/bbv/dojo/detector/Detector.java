package ch.bbv.dojo.detector;

import ch.bbv.dojo.Card;

import java.util.List;

/**
 * Created by gro on 07/04/16.
 */
public interface Detector {

    boolean is(List<Card> hand);
}
