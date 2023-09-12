package org.launchcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.StringCache;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void openCloseAtBeginningAndEndTest() {
        String msg = "testing open close brackets at beginning and end";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"),msg);
    }
    @Test
    public void openInMiddleCloseAtEndTest() {
        String msg = "testing open bracket in middle and close bracket at end";
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"),msg);
    }

    @Test
    public void openAndCloseAtBeginningTest() {
        String msg = "testing open and close brackets at beginning";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"),msg);
    }

    @Test
    public void noBracketsTest() {
        String msg = "testing with no brackets";
        assertTrue(BalancedBrackets.hasBalancedBrackets(""),msg);
    }

    @Test
    public void openCloseBracketsTest() {
        String msg = "testing with open close brackets";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"),msg);
    }

    @Test
    public void openBracketOnlyAtBeginningTest() {
        String msg = "testing with open bracket only at the beginning";
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"),msg);
    }

    @Test
    public void closeBracketInMiddleAndOpenAtEndTest() {
        String msg = "testing with close bracket in middle and open at the end";
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["),msg);
    }
    @Test
    public void onlyOpeningBracketTest() {
        String msg = "testing with only open bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("["),msg);
    }
    @Test
    public void closeOpenBracketTest() {
        String msg = "testing with close and open bracket only";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["),msg);
    }

    @Test
    public void onlyClosingBracketTest() {
        String msg = "testing with only closing bracket";
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"),msg);
    }
    @Test
    public void closeBracketOnlyAtEndTest() {
        String msg = "testing with close bracket only at the end";
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"),msg);
    }

}