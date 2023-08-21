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
 * [Multiples of 3 or 5](https://www.codewars.com/kata/514b92a657cdc65150000006)
 *
 * If we list all the natural numbers below 10 that are
 * multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all
 * the multiples of 3 or 5 below the number passed in.
 * Additionally, if the number is negative,
 * return 0 (for languages that do have them).
 *
 * Note: If the number is a multiple of both 3 and 5,
 * only count it once.
 *
 * Courtesy of projecteuler.net (Problem 1)
 */
object MultiplesOf {
    fun Int.sumMultiplesOf(vararg numbers: Int): Int =
        numbers.map { it..<this step it }
            .fold(emptySet<Int>()) { acc, i -> acc.union(i) }
            .sum()

    fun Int.sumMultiplesOf3Or5(): Int =
        sumMultiplesOf(3, 5)
}