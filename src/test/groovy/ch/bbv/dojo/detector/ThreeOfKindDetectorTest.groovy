package ch.bbv.dojo.detector

import spock.lang.Specification

import static ch.bbv.dojo.Hand.hand

/**
 * Created by gro on 08/04/16.
 */
class ThreeOfKindDetectorTest extends Specification {
    def "Should be three of kind "() {
        given:
        def hand = hand("C2", "H2", "D2", "H7", "C13")

        expect:
        new ThreeOfKindDetector(hand).is()
    }

    def "Should not be three of kind"() {
        given:
        def hand = hand("C12", "H2", "H4", "H7", "C13")

        expect:
        !new ThreeOfKindDetector(hand).is()
    }
}
