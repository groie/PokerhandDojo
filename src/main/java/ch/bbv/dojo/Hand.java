package ch.bbv.dojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gro on 08/04/16.
 */
public class Hand {

    public static List<Card> hand(String... cardStrings) {
        return Arrays.stream(cardStrings).map(Card::card).collect(Collectors.toList());
    }

    public static List<Card> sort(List<Card> cards) {
        ArrayList<Card> defCopy = new ArrayList<>(cards);
        defCopy.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        return defCopy;
    }
}
