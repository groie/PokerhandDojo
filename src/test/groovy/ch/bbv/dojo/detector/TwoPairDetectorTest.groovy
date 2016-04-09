package ch.bbv.dojo.detector

import spock.lang.Specification
import spock.lang.Unroll

import static ch.bbv.dojo.Hand.hand

/**
 * Created by gro on 07/04/16.
 */
class TwoPairDetectorTest extends Specification {

    def "should be two pairs"() {
        given:
        def hand = hand("C2", "H2", "H4", "H4", "C13")

        expect:
        new TwoPairDetector(hand).is()
    }

    @Unroll
    def "#dealtHand should not have two pairs"() {
        expect:
        !new TwoPairDetector(dealtHand).is()

        where:
        dealtHand << [
                    hand("C2", "H2", "H4", "H7", "C13"),
                    hand("C2", "H7", "H4", "H5", "C13")
                ]

    }
}
