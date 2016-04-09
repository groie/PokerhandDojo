package ch.bbv.dojo.detector

import spock.lang.Specification

import static ch.bbv.dojo.Hand.hand

/**
 * Created by gro on 07/04/16.
 */
class PairDetectorTest extends Specification {
    def "Should be a pair"() {
        given:
        def hand = hand("C2", "H2", "H4", "H7", "C13")

        expect:
        new PairDetector(hand).is()
    }

    def "Should not be a pair"() {
        given:
        def hand = hand("C12", "H2", "H4", "H7", "C13")

        expect:
        !new PairDetector(hand).is()
    }
}
