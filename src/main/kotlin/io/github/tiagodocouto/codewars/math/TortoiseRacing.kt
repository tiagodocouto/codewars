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

package io.github.tiagodocouto.codewars.math

/**
 * [Tortoise Racing](https://www.codewars.com/kata/55e2adece53b4cdcb900006c)
 *
 * Two tortoises named A and B must run a race.
 * A starts with an average speed of 720 feet per hour.
 * Young B knows she runs faster than A, and furthermore has not finished her cabbage.
 *
 * When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour.
 * How long will it take B to catch A?
 *
 * More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0)
 * and a lead g (integer > 0) how long will it take B to catch A?
 *
 * The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds
 * (round down to the nearest second) or a string in some languages.
 *
 * If v1 >= v2 then return nil, nothing, null, None
 * or {-1, -1, -1} for C++, C, Go, Nim, Pascal, COBOL, Erlang,
 * [-1, -1, -1] for Perl,
 * [] for Kotlin
 * or "-1 -1 -1" for others.
 *
 * Examples:
 *
 * (form of the result depends on the language)
 *
 * ```kotlin
 * race(720, 850, 70) shouldBe intArrayOf(0, 32, 18)
 * race(80, 91, 37) shouldBe intArrayOf(3, 21, 49)
 * ```
 *
 * Note:
 *
 * See other examples in "Your test cases".
 *
 * In Fortran - as in any other language -
 * the returned string is not permitted to contain any redundant trailing
 * whitespace: you can use dynamically allocated character strings.
 *
 * ** Hints for people who don't know how to convert to hours, minutes, seconds:
 *
 * Tortoises don't care about fractions of seconds
 * Think of calculation by hand using only integers (in your code use or simulate integer division)
 * or Google: "convert decimal time to hours minutes seconds"
 */
object TortoiseRacing {
    private const val MINUTES = 60
    private const val SECONDS = MINUTES * 60

    // return [] if v1 >= v2
    fun race(v1: Int, v2: Int, g: Int): IntArray =
        if (v1 >= v2) intArrayOf()
        else {
            val seconds = (SECONDS * g) / (v2 - v1)
            intArrayOf(seconds / SECONDS, seconds / MINUTES % MINUTES, seconds % MINUTES)
        }
}
