package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextTest {
    private String text = "Hello world! Hello! Hello, world. Hello- all world! Hello: to me?";
    private String emptyString = "";
    private String neededResultText = "Hello world! Hello, world. Hello- all world! Hello: to me?";
    private String neededEmptyResult = "";
    private String actualResultText;
    private int minNumberOfWords = 2;

    @Test
    void testExclamatorySentences() {
        Text test = new Text();

        actualResultText = test.exclamatorySentences(text, minNumberOfWords);
        Assert.assertEquals(neededResultText, actualResultText);

    }

    @Test
    void testEmptyString(){
        Text test = new Text();

        actualResultText = test.exclamatorySentences(emptyString, minNumberOfWords);
        Assert.assertEquals(neededEmptyResult, actualResultText);
    }

}