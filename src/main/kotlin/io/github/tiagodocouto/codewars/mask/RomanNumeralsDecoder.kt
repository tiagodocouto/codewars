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

package io.github.tiagodocouto.codewars.mask

/**
 * [Roman Numerals Decoder](https://www.codewars.com/kata/51b6249c4612257ac0000005)
 *
 * [Modern Roman numerals](https://en.wikipedia.org/wiki/Roman_numerals#Standard_form) are written by expressing each
 * decimal digit of the number to be encoded separately, starting with the leftmost digit and skipping any 0s.
 * So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC)
 * and 2008 is rendered "MMVIII" (2000 = MM, 8 = VIII).
 * The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.
 *
 * Example:
 * ```kotlin
 * decode("XXI") shouldBe 21
 * ```
 *
 * Help:
 * ```markdown
 * | Symbol | Value |
 * |--------|-------|
 * | I      | 1     |
 * | V      | 5     |
 * | X      | 10    |
 * | L      | 50    |
 * | C      | 100   |
 * | D      | 500   |
 * | M      | 1,000 |
 * ```
 * Courtesy of rosettacode.org
 */
object RomanNumeralsDecoder {
    private val roman = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)

    fun decode(string: String): Int =
        string
            .replace("CM", "DCCCC")
            .replace("CD", "CCCC")
            .replace("XC", "LXXXX")
            .replace("XL", "XXXX")
            .replace("IX", "VIIII")
            .replace("IV", "IIII")
            .mapNotNull { roman[it] }
            .sum()
}
