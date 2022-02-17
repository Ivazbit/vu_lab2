package com.example.vu_lab2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun countAllWordsInSentence() {
        val givenString = "Sample code that will print Hello, World!."
        val expectedResult = 7
        val actualResult = CountingActivity().wordCount(givenString)

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun countAllPunctInSentence() {
        val givenString = "Keeping them focused with symbols: .,-+\\/"
        val expectedResult = 7
        val actualResult = CountingActivity().punctuationCount(givenString)

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun emptyWordCase() {
        val givenString = ""
        val expectedResult = 0
        val actualResult = CountingActivity().wordCount(givenString)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun emptyPunctuationCase() {
        val givenString = ""
        val expectedResult = 0
        val actualResult = CountingActivity().punctuationCount(givenString)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun emptyWordSentence() {
        val givenString = "<?>?: ';.];;'; \'/."
        val expectedResult = 0
        val actualResult = CountingActivity().wordCount(givenString)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun emptyPunctuationSentence() {
        val givenString ="The reason why is because punctuation can change the meaning of " +
                    "your sentence according to where it is placed"
        val expectedResult = 0
        val actualResult = CountingActivity().punctuationCount(givenString)
        assertEquals(expectedResult, actualResult)
    }

}