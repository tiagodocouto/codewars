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
 * [Take a Ten Minutes Walk](https://www.codewars.com/kata/54da539698b8a2ad76000228)
 *
 * You live in the city of Cartesia where all roads are laid out in a perfect grid.
 * You arrived ten minutes too early to an appointment, so you decided to take the
 * opportunity to go for a short walk. The city provides its citizens with a Walk
 * Generating App on their phones -- everytime you press the button it sends you
 * an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']).
 * You always walk only a single block for each letter (direction) and you know it takes you
 * one minute to traverse one city block, so create a function that will return true if
 * the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!)
 * and will, of course, return you to your starting point.
 * Return false otherwise.
 *
 * Note: you will always receive a valid array containing a random assortment of direction
 * letters ('n', 's', 'e', or 'w' only).
 * It will never give you an empty array (that's not a walk, that's standing still!).
 */
object TakeATenMinutesWalk {
    fun isValid10MinutesWalk(walk: List<Char>): Boolean =
        walk.size == 10 && walk.groupBy { it }
            .let {
                it['n']?.size == it['s']?.size && it['e']?.size == it['w']?.size
            }
}
