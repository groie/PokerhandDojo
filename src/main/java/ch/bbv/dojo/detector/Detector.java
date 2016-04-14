package ch.bbv.dojo.detector;

import ch.bbv.dojo.HandRank;

/**
 * Created by gro on 07/04/16.
 */
public interface Detector {

    boolean is();

    HandRank getHandRank();
}
