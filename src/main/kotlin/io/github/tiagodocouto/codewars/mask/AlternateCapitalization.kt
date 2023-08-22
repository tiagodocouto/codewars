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
 * [Alternate capitalization](https://www.codewars.com/kata/59cfc000aeb2844d16000075)
 *
 * Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
 * and return as shown below. Index 0 will be considered even.
 *
 * For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
 *
 * The input will be a lowercase string with no spaces.
 *
 * Good luck!
 */
object AlternateCapitalization {
    private fun fold(i: Int, acc: List<String>, c: Char) =
        if (i % 2 == 0) listOf(acc[0] + c.uppercase(), acc[1] + c.lowercase())
        else listOf(acc[0] + c.lowercase(), acc[1] + c.uppercase())

    fun capitalize(text: String): List<String> =
        text.toCharArray()
            .foldIndexed(listOf("", ""), ::fold)
}
