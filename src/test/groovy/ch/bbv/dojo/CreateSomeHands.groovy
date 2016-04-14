package ch.bbv.dojo

import ch.bbv.dojo.detector.HandMapper
import spock.lang.Specification

import java.util.stream.Collectors

/**
 * Created by gro on 14/04/16.
 */
class CreateSomeHands extends Specification {


    def "do some hand detecting"() {
        expect:
        def hands = new ArrayList()

        for(int i = 0 ; i < 10000 ; i++) {
            def hand = Deck.shuffledDeck.cardStream.limit(5).collect(Collectors.toList());
            hands.add(hand);
        }

        hands.each { List<Card> hand ->
            def rank = new HandMapper(hand).getRank()
            if (rank != HandRank.HighCard && rank != HandRank.Pair) {
                println sprintf("%s - %s", rank, hand)
            }
        }

    }
}
