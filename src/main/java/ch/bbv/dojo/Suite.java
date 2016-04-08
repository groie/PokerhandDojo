package ch.bbv.dojo;

import java.util.Arrays;

/**
 * Created by gro on 31/01/16.
 */
public enum Suite {
    HEARTS, CLUBS, DIAMONDS, SPADES;

    @Override
    public String toString() {
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }

    public static Suite of(String character) {
        return Arrays.stream(values())
                .filter(s -> s.name().substring(0, 1).toLowerCase().equals(character.toLowerCase())).findFirst().orElseThrow(RuntimeException::new);
    }
}
