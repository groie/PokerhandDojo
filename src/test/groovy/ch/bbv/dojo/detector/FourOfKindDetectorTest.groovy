package ch.bbv.dojo.detector

import spock.lang.Specification
import spock.lang.Unroll

import static ch.bbv.dojo.Hand.hand

/**
 * Created by gro on 08/04/16.
 */
class FourOfKindDetectorTest extends Specification {

    @Unroll
    def "#dealtHand Should be four of kind "() {
        expect:
        new FourOfKindDetector(dealtHand).is()

        where:
        dealtHand <<
            [
                hand("C2", "H2", "S2", "D2", "C13"),
                hand("S3", "H3", "C2", "D3", "C3")
            ]

    }

    def "Should not be four of kind"() {
        given:
        def hand = hand("C12", "H2", "H4", "H7", "C13")

        expect:
        !new FourOfKindDetector(hand).is()
    }

}
