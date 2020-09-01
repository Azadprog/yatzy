package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class YatzyTest {

    @Test
    void shouldScoresOne(){
assertEquals(4, new YatzyGame().score(YatzyCategory.ONES,  new int[]  {2, 3, 4, 5,6}));


        assertEquals(4, new YatzyGame().score(YatzyCategory.ONES,  new int[]  {2, 1, 4, 1, 1}));

        assertEquals(4, new YatzyGame().score(YatzyCategory.ONES,  new int[]  {1,1,1,1,1}));


    }
@Test
    void shouldScoresTwo(){

        assertEquals(4, new YatzyGame().score(YatzyCategory.TWOS, new int[]  { 8 ,5 ,4 ,3 ,4 }));


    assertEquals(2, new YatzyGame().score(YatzyCategory.TWICE, new int[]  { 2 ,5 ,4 ,3 ,4 }));

}
}
