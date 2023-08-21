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

import kotlin.math.pow

/**
 * [Sum of odd numbers](https://www.codewars.com/kata/55fd2d567d94ac3bc9000064)
 *
 * Given the triangle of consecutive odd numbers:
 *              1
 *           3     5
 *        7     9    11
 *    13    15    17    19
 * 21    23    25    27    29
 * ...
 * Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
 *
 * 1 -->  1
 * 2 --> 3 + 5 = 8
 */
object SumTriangleOddNumbers {
    fun Int.sumTriangleOdd(): Int = toDouble().pow(3.0).toInt()
}
