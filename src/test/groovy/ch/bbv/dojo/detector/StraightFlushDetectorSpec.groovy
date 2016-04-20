package ch.bbv.dojo.detector

import spock.lang.Specification

import static ch.bbv.dojo.Hand.hand

/**
 * Created by gro on 14/04/16.
 */
class StraightFlushDetectorSpec extends Specification {

    def "Should be a straight flush"() {
        given:
        def hand = hand("C2", "C3", "C4", "C5", "C6")

        expect:
        new StraightFlushDetector(hand).is()
    }

    def "Should not be a  staright flush"() {
        given:
        def hand = hand("C2", "C3", "H4", "C5", "C6")

        expect:
        !new StraightFlushDetector(hand).is()
    }

}
