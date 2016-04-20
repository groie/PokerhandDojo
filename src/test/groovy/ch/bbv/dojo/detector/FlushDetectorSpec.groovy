package ch.bbv.dojo.detector

import spock.lang.Specification

import static ch.bbv.dojo.Hand.hand

/**
 * Created by gro on 08/04/16.
 */
class FlushDetectorSpec extends Specification {

    def "Should be a flush"() {
        given:
        def hand = hand("C2", "C3", "C4", "C7", "C13")

        expect:
        new FlushDetector(hand).is()
    }

    def "Should not be a flush"() {
        given:
        def hand = hand("C12", "H2", "H4", "H7", "C13")

        expect:
        !new FlushDetector(hand).is()
    }
}
