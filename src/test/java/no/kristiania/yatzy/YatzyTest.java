package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class YatzyTest {

    @Test
    void shouldScoresOne(){
assertEquals(4, new YatzyGame().score);
    }

}
