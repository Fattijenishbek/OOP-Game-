package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {

    @Test
    public void snakeColor1(){
        Snake snakePlay = new Snake();
        String result1 = snakePlay.snakeColor("Blue");
        assertEquals("This snake is Blue", result1);
    }
    @Test
    public void snakeColor2(){
        Snake snakePlay = new Snake();
        String result2 = snakePlay.snakeColor("");
        assertEquals("This snake has no color", result2);
    }

    @Test
    public void snakeColor3(){
        Snake snakePlay = new Snake();
        String result3 = snakePlay.snakeColor("Mental Mint Purple Amaranth");
        assertEquals("It is not a valid color name", result3);
    }

    @Test
    public void snakeColor4(){
        Snake snakePlay = new Snake();
        String result4 = snakePlay.snakeColor("Black4");
        assertEquals("Color shouldn't contain any digits", result4);
    }
}