package com.example.vu_lab2

import android.text.Editable

class CountingActivity {
    fun wordCount(stringValue: Editable): Int {
        val trimmedStr = stringValue.trim()
        var counterWords = 0
        return if (trimmedStr.isEmpty()) {
            counterWords
        } else {
            counterWords = """\w+""".toRegex().findAll(trimmedStr).count()
            return counterWords
        }
    }

    fun punctuationCount(stringValue: Editable): Int {
        val trimmedStr = stringValue.trim()
        val punctuation = "[!\\#$%&'()*+,\"\\-./:;<=>?@\\[\\]^_‘{|}~]"
        var counterPunct = 0
        return if (trimmedStr.isEmpty()) {
            0
        } else {
            for (char in trimmedStr) {
                if (punctuation.contains(char)) {
                    counterPunct++
                }
            }
            return counterPunct
        }
    }
}