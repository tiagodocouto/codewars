/*
 * Copyright (c) 2023 Tiago do Couto.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.github.tiagodocouto.codewars.string

/**
 * [Decode the Morse code](https://www.codewars.com/kata/54b724efac3d5402db00065e)
 *
 * This kata is part of a series on the Morse code. After you solve this kata, you may move to the next one.
 *
 * In this kata you have to write a simple Morse code decoder.
 * While the Morse code is now mostly superseded by voice and digital data communication channels,
 * it still has its use in some applications around the world.
 *
 * The Morse code encodes every character as a sequence of "dots" and "dashes".
 * For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−.
 * The Morse code is case-insensitive, traditionally capital letters are used. When the message is written
 * in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate
 * words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.
 *
 * NOTE: Extra spaces before or after the code have no meaning and should be ignored.
 *
 * In addition to letters, digits and some punctuation, there are some special service codes,
 * the most notorious of those is the international distress signal SOS (that was first issued by Titanic),
 * that is coded as ···−−−···. These special codes are treated as single special characters, and usually are
 * transmitted as separate words.
 *
 * Your task is to implement a function that would take the morse code as input and return a
 * decoded human-readable string.
 *
 * For example:
 *
 * ```kotlin
 * decodeMorse('.... . -.--   .--- ..- -.. .') shouldBe "HEY JUDE"
 * ```
 *
 * NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.
 *
 * Kotlin: MorseCode[".--"] ?: "" or MorseCode.getOrDefault(".--", "")
 *
 * All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions.
 * In C#, tests will fail if the solution code throws an exception, please keep that in mind.
 * This is mostly because otherwise the engine would simply ignore the tests, resulting in a "valid" solution.
 *
 * Good luck!
 *
 * After you complete this kata, you may try yourself at Decode the Morse code, advanced.
 */
object MorseCodeDecoder {
    private val map: Map<String, String> = mapOf(
        "-.-.--" to "!",
        ".-..-." to "\"",
        "...-..-" to "$",
        ".-..." to "&",
        ".----." to "'",
        "-.--." to "(",
        "-.--.-" to ")",
        ".-.-." to "+",
        "--..--" to ",",
        "-....-" to "-",
        ".-.-.-" to ".",
        "-..-." to "/",
        "-----" to "0",
        ".----" to "1",
        "..---" to "2",
        "...--" to "3",
        "....-" to "4",
        "....." to "5",
        "-...." to "6",
        "--..." to "7",
        "---.." to "8",
        "----." to "9",
        "---..." to ":",
        "-.-.-." to ";",
        "-...-" to "=",
        "..--.." to "?",
        ".--.-." to "@",
        ".-" to "A",
        "-..." to "B",
        "-.-." to "C",
        "-.." to "D",
        "." to "E",
        "..-." to "F",
        "--." to "G",
        "...." to "H",
        ".." to "I",
        ".---" to "J",
        "-.-" to "K",
        ".-.." to "L",
        "--" to "M",
        "-." to "N",
        "---" to "O",
        ".--." to "P",
        "--.-" to "Q",
        ".-." to "R",
        "..." to "S",
        "-" to "T",
        "..-" to "U",
        "...-" to "V",
        ".--" to "W",
        "-..-" to "X",
        "-.--" to "Y",
        "--.." to "Z",
        "..--.-" to "_",
        "...---..." to "SOS",
    )

    fun decodeMorse(code: String): String =
        code.toMorseArray()
            .joinToString("") { map[it] ?: " " }

    private fun String.toMorseArray(): List<String> =
        trim()
            .replace("  ", " ")
            .split(Regex("\\s"))
}
