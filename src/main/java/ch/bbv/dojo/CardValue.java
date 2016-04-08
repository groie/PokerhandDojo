package ch.bbv.dojo;

import java.util.Arrays;

import static java.util.Arrays.stream;

/**
 * Created by gro on 31/01/16.
 */
public enum CardValue {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

    private int value;

    CardValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static CardValue of(int value) {
        return stream(values()).filter(cv -> cv.value == value).findFirst().orElseThrow(RuntimeException::new);
    }

    @Override
    public String toString() {
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
