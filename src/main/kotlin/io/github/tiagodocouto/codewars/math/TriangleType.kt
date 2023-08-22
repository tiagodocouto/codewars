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

import io.github.tiagodocouto.codewars.math.TriangleType.Type.ACUTE
import io.github.tiagodocouto.codewars.math.TriangleType.Type.NOT_TRIANGLE
import io.github.tiagodocouto.codewars.math.TriangleType.Type.OBTUSE
import io.github.tiagodocouto.codewars.math.TriangleType.Type.RIGHT

/**
 * [Triangle type](https://www.codewars.com/kata/53907ac3cd51b69f790006c5/)
 *
 * In this kata, you should calculate the type of triangle with three given sides a, b and c (given in any order).
 *
 * If each angle is less than 90°, this triangle is acute and the function should return 1.
 *
 * If one angle is strictly 90°, this triangle is right and the function should return 2.
 *
 * If one angle is more than 90°, this triangle is obtuse and the function should return 3.
 *
 * If three sides cannot form a triangle, or one angle is 180° (which turns the triangle into a segment) -
 * the function should return 0.
 *
 * Three input parameters are sides of given triangle.
 * All input values are non-negative floating point or integer numbers (or both, depending on the language).
 *
 *
 * Examples:
 *
 * ```markdown
 * |    input   |   output   |           comment           |
 * |------------|------------|-----------------------------|
 * |  (2, 4, 6) |      0     | not triangle                |
 * |  (8, 5, 7) |      1     | acute (82°, 38°, 60°)       |
 * |  (3, 4, 5) |      2     | right (37°, 53°, 90°)       |
 * | (7, 12, 8) |      3     | obtuse (34°, 106°, 40°)     |
 * ```
 *
 * If you stuck, this can help you:
 * [http://en.wikipedia.org/wiki/Law_of_cosines](http://en.wikipedia.org/wiki/Law_of_cosines).
 * But you can solve this kata even without angle calculation.
 *
 * There is a very small chance of random test to fail due to round-off error, in such case resubmit your solution.
 */
object TriangleType {
    enum class Type(val value: Int) {
        NOT_TRIANGLE(0),
        ACUTE(1),
        RIGHT(2),
        OBTUSE(3)
    }

    private val Double.square: Double
        get() = this * this

    /**
     *  Should return the ᐃ type:
     *  0: if ᐃ cannot be made with given sides
     *  1: acute ᐃ
     *  2: right ᐃ
     *  3: obtuse ᐃ
     */
    fun type(a: Double, b: Double, c: Double): Type =
        arrayOf(a, b, c).sortedArray().let { (a1, b1, c1) ->
            when {
                a1 + b1 <= c1 -> NOT_TRIANGLE
                a1.square + b1.square > c1.square -> ACUTE
                a1.square + b1.square == c1.square -> RIGHT
                a1.square + b1.square < c1.square -> OBTUSE
                else -> NOT_TRIANGLE
            }
        }
}
