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

import java.math.BigInteger

object PascalTriangle {
    private var triangle: Array<Array<BigInteger?>?> = arrayOfNulls(0)

    private fun calculateEdges(i: Int) {
        triangle[i] = arrayOfNulls(i + 1)
        triangle[i]!![0] = BigInteger.valueOf(1L)
        triangle[i]!![i] = triangle[i]!![0]
    }

    private fun cached(row: Int, col: Int): String? =
        triangle.getOrNull(row)?.getOrNull(col - 1)?.toString()

    private fun calculate(row: Int, col: Int): String {
        triangle = triangle.copyOf(row + 1)
        for (i in 0..row) {
            if (triangle[i]?.isNotEmpty() == true) continue
            calculateEdges(i)

            for (j in 1..<i) {
                triangle[i]!![j] = triangle[i - 1]!![j]!! + triangle[i - 1]!![j - 1]!!
            }
        }

        return cached(row, col)!!
    }

    fun findPascalNumberOn(row: Int, col: Int): String =
        cached(row, col) ?: calculate(row, col)
}
